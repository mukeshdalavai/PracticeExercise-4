package com.stackroute.pe4;
import java.util.*;
public class WordPresence {
    public static void main(String[] args) {
        boolean contains = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");

        String s = scanner.nextLine();
        String[] str = s.split(" ");

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String s1 = scanner1.nextLine();
        String[] str1 = s1.split(" ");

        if(s.contains(s1)){
            contains = true;

            System.out.println("is " + s1 +" here? True");
        }

        else{

            System.out.println("is " + s1 + " here? False");
        }
    }
}
