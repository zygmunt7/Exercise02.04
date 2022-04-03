package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       String decisuin;
       do {

           System.out.print("Please instert first digit: ");
           float firstDigit = scanner.nextFloat();
           scanner.nextLine();
           System.out.print("Please insert operator: ");
           String operator = scanner.nextLine();
           System.out.print("Please instert second digit: ");
           float secondDigit = scanner.nextFloat();
           scanner.nextLine();

           float result = calculate(firstDigit, secondDigit, operator);
           System.out.println("Result: " +result);

           System.out.println("New calculation os Stop? ");
           decisuin=scanner.nextLine();
       }
       while (!"Stop".equals(decisuin));
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        return 0;
    }
}
