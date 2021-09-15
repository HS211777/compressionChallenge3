package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Enter a series of letters:");
    String userInput = input.next();
    int length1 = userInput.length();
    String output = "";
    ArrayList<String> letters = new ArrayList<String>();
    int i;
    for (i = 0; i < length1; i++){
        String subStr = userInput.substring(i,i+1);
        letters.add(subStr);
    }
    System.out.println(letters);
    int tally = 0;
    for (i = 0; i < length1; i++){
        if (letters.contains(i) == letters.contains(i+1)){
            tally = tally + 1;
        }
        else{
            
            tally = 0;
        }
    }
    }
}
