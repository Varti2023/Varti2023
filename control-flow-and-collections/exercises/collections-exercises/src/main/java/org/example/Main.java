package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //ArrayList  Exercise part 1 -----
        int[] numbers = new int[]{1,1,2,3,5,8};
        System.out.println("Numbers in array :");
        for(int number : numbers) {
            System.out.println(number);
        }
        System.out.println("\nOdd Numbers in array :");
        for(int number : numbers) {
            if(number % 2 !=0){
                System.out.println(number);
            }
        }

        //ArrayList  Exercise part 2 -----

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strWithoutSpace = phrase.split(" ");
        // String in array
        System.out.println(Arrays.toString(strWithoutSpace));
        // String delimited by '.'
        String[] newSentences  = phrase.split("\\.");
        System.out.println(Arrays.toString(newSentences));

        ArrayList<Integer> intNumbers = new ArrayList<>();
        for(int i=0;i<10;i++){
            intNumbers.add(i);
        }
        System.out.println("Numbers in arrayList "+intNumbers);
        System.out.println("\nSum of even numbers in arraylist - "+ArrayListExercises.sumEvenNum(intNumbers));

        // ArrayList Exercise part 3 -----
        // ArrayList<String> words = new ArrayList<>();
        //adding words to arraylist.
//        words.add("Nachos");
//        words.add("Chips");
//        words.add("Cookie");
//        words.add("Donut");
//        words.add("Juices");
//        words.add("Coffee");

        //System.out.println("Words in arrayList "+strList);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();


        // ArrayList Exercise Bonus Mission ----Using the string phrase from Array example.
        // Converting the string to Arraylist.
        String[] strSplit = phrase.split(" ");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));


        if(ArrayListExercises.printWords(strList, numChars).size() > 0) {
            System.out.println("\nWords with length " + numChars + " are - " + ArrayListExercises.printWords(strList, numChars));
          }else{
            System.out.println("Word not found!");
            System.out.println("Enter a word length: ");
            numChars = input.nextInt();
            ArrayListExercises.checkWords(strList,numChars);
        }
        input.close();
    }
}