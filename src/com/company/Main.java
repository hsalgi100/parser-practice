package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File f = new File("C:/Users/helen.DESKTOP-9PHR09U/Desktop/JProjects/p2-parser/Test3.txt");
        Scanner input = null;
	    try{
            input = new Scanner(f);
        }catch(FileNotFoundException fileNotFound){
            System.out.println("This file does not exist.");
            System.exit(1);
        }
	    int aValue = 0;
	    int bValue = 0;

	    while(input.hasNextLine()){
	        String[] parts = input.nextLine().split(" = ");
	        String numPart = parts[parts.length - 1];

	        if(parts[0].equals("a")){
                int value = Integer.parseInt(numPart);
                aValue = value;
            }
            if(parts[0].equals("b")){
                int value = Integer.parseInt(numPart);
                bValue = value;
            }
        }
        if(aValue == 0){
            System.out.print("");
        }
        else{System.out.println("a: " + aValue);}
        if(bValue == 0){
            System.out.print("");
        }
        else{System.out.println("b: " + bValue);}
    }
}
