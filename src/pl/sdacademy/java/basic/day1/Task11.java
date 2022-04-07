package pl.sdacademy.java.basic.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String s = toMatch();

    }
    private static String toMatch(){
        Random random =new Random();
        Scanner scanner=new Scanner(System.in);

        for (int i=0; i<1;i++){
            int randomdigit = (int)(Math.random()*100);

                do {
                    System.out.print("Please insert digit: ");
                    int myDigit = scanner.nextInt();
                    if (myDigit == randomdigit){
                        System.out.println("Bingo");
                        break;
                    }else if (myDigit > randomdigit) {
                        System.out.println("Too much!");
                    }else if(myDigit < randomdigit) {
                        System.out.println("Not enought!");
                    }

                }while (randomdigit !=0);


        }


        return null;
    }
}
