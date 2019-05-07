package com.stackroute.pe4;

public class LetterFrequency {
    public int frequencyFinder(String inputString,String letter){
        int frequency=inputString.length()-inputString.replaceAll(letter,"").length();
        return frequency;
    }
}
