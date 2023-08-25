package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        String message = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        message = message.toLowerCase();
//        message = message.replaceAll("[^A-Za-z0-9]", "");
//        characterCount(message);

        // Bonus mission part 1 ------
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter String :");
          String str = input.nextLine();
          str=str.replaceAll("[^A-Za-z0-9]", "");
          characterCount(str);
          characterCount(readFromFile().toLowerCase());
         //  System.out.println(readFromFile());
    }

    //Bonus mission part 2 (read from txt file) ---


        public static void characterCount(String inputString){
        HashMap<Character,Integer> characterCount = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for(char letter : strArray){
            if(characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) + 1);
            }else{
                characterCount.put(letter,1);
            }
         }

        for(Map.Entry<Character,Integer> character: characterCount.entrySet()){
            System.out.println(character.getKey()+": "+character.getValue());
        }
    }

        public static String readFromFile() throws FileNotFoundException{
            File file =  new File("src/main/java/org/example/message.txt");
            Scanner scan = new Scanner(file);
            String fileContent = "";
            while(scan.hasNext()){
                fileContent = fileContent.concat(scan.nextLine() + "\n");
            }
            fileContent = fileContent.replaceAll("[^A-Za-z0-9]", "");
            System.out.println(fileContent);
            return fileContent;
        }
}