package org.example;

import java.util.ArrayList;

public class ArrayListExercises {

    // ArrayList Exercise Part 1 ------
    public static int sumEvenNum(java.util.ArrayList<Integer> arr){
        int sum =0;
        for(int i : arr){
            if(i%2==0){
                sum = sum+i;
            }
        }
        return sum;
    }

    // ArrayList Exercise Part 2-------
    public static java.util.ArrayList<String> printWords(java.util.ArrayList<String> strArr, int num){
        java.util.ArrayList<String> words = new java.util.ArrayList<>();
        for(String word : strArr){
            if(word.length() == num){
                words.add(word);
            }
        }
        return words;
    }

    // Bonus Mission  ---- checkWord method to check the words in else loop
    public static void checkWords(ArrayList<String> strList, int num){
        if(ArrayListExercises.printWords(strList, num).size() > 0) {
            System.out.println("\nWords with length " + num + " are - " + ArrayListExercises.printWords(strList, num));
        }
    }
}
