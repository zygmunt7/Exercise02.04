package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int digit = getDigit();
        int sum =0;
        while (digit!=0){
            sum += digit%10;
            digit/=10;
        }
        System.out.print("Sum of digit: "+sum);

    }
    private static int getDigit (){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please insert digit: ");
        return scanner.nextInt();
    }
}
