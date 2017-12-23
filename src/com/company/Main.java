package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:/Users/helen.DESKTOP-9PHR09U/Desktop/JProjects/p2-parser/Test1.txt");
	    Scanner input = new Scanner(f);
	    while(input.hasNextLine()){
	        String[] parts = input.nextLine().split("=");
            StringJoiner joiner = new StringJoiner(":");
            for(String part: parts){
                joiner.add(part);
            }
            String output = joiner.toString();
            System.out.println(output);
        }
    }
}
