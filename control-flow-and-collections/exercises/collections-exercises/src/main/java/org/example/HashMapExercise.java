package org.example;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class HashMapExercise {

    public static void main(String[] args) {
        HashMap<Integer, String> studentsMap = new HashMap<Integer, String>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter student name (or ENTER to finish): ");
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("Enter  student ID: ");
                int id = input.nextInt();
                studentsMap.put(id, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));
        input.close();

        System.out.println("\n Class roaster: ");

        for (Map.Entry<Integer, String> student : studentsMap.entrySet()) {
            System.out.println(student.getValue() + "'s ID: "+student.getKey());
        }
        System.out.println("Number of students in roster: " + studentsMap.size());
    }
}


