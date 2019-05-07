package com.stackroute.pe4;

import java.util.Scanner;

public class SortWords {
    public String sort(String inputPara){
        String newPara="";
        String[] words=inputPara.split("\\s");
        for (int k=0;k<words.length;k++) {
            for(int i=k+1;i<(words.length);i++){
                if(words[k].compareTo(words[i])>0){
                    String temp=words[k];
                    words[k]=words[i];
                    words[i]=temp;
                }
            }
        }
        for (String word:words) {
            word=word+" ";
            newPara=newPara.concat(word);
        }
        return newPara;
    }
    public static void main(String[] args){
        String inputPara,newPara;
        SortWords sortWords=new SortWords();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Para: ");
        inputPara=sc.nextLine();
        newPara=sortWords.sort(inputPara);
        System.out.println("Sorted Para is: \n"+newPara);
    }
}
