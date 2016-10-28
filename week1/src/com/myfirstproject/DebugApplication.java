package com.myfirstproject;

import java.util.Arrays;
import java.util.List;

public class DebugApplication {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four", "five");
        int x = 0;
        for (String s : words) {
            System.out.println(s);
            x= x+1;
        }
        if(x==6){
            System.out.println("Correct!");
        }
    }
}
