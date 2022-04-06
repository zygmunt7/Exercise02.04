package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int x= getFirstDigit();
        int y= getSecondDigit();
        System.out.println("If x is greater than y: "+(x>y));
        System.out.println("If x*3 greater yhan y: "+(x*3 >y));
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: "+((y++<++x)&&(--x<y++)));
        System.out.println("If x *Y is even: "+((x%2!=0)&&y%2!=0));
    }
    private static int getFirstDigit (){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        return  scanner.nextInt();


    }
    private static int getSecondDigit (){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please insert second digit: ");
        return scanner.nextInt();
    }

}
