package pl.sdacademy.java.basic.day2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int lenghtOfTheWord = 0;
        String longestWord= null;

        do {
            System.out.print("Please insert your text: ");
            input =scanner.nextLine();
            if(input.isBlank()){
                System.out.println("Is Empty");
            }else if (!"Enought".equals(input)){
                if (lenghtOfTheWord < input.length()){
                    longestWord = input;
                    lenghtOfTheWord=input.length();
                }
            }
        }while (!"Enought".equals(input));

    }
}

