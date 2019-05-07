package com.stackroute.pe4;

import java.util.Scanner;

public class TransposeString {
    public String transpose(String inputString){
        String newString="";
        String[] words=inputString.split("\\s");
        for (String word:words) {
            String reverse=new StringBuffer(word).reverse().toString();
            reverse+=" ";
            newString=newString.concat(reverse);
        }
        return newString;
    }
    public static void main(String[] args){
        String inputString,newString;
        TransposeString transposeString=new TransposeString();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        inputString=sc.nextLine();
        newString=transposeString.transpose(inputString);
        System.out.println("Sorted Para is: \n"+newString);
    }
}
