package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File f = new File("C:/Users/helen.DESKTOP-9PHR09U/Desktop/JProjects/p2-parser/Test1.txt");
        Scanner input = null;
	    try{
            input = new Scanner(f);
        }catch(FileNotFoundException fileNotFound){
            System.out.println("This file does not exist.");
            System.exit(1);
        }
        int[] values = new int[26];

	    while(input.hasNextLine()){
	        String[] parts = input.nextLine().split(" = ");
	        String numPart = parts[parts.length - 1];
	        char c = parts[0].charAt(0);
	        int i = c - 'a';

	        values[i] = Integer.parseInt(numPart);
        }
        for(int i = 0; i < values.length; i++){
            int c = 'a' + i;
	        if(values[i] == 0){
                continue;
            }
            System.out.println((char)c + ": " + values[i]);
        }
    }
}
