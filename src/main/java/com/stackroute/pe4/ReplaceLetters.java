package com.stackroute.pe4;

public class ReplaceLetters {
    public String replaceString(String inputString){
        String newString=inputString.replaceAll("d","f");
        newString=newString.replaceAll("l","t");
        return newString;
    }
}
