package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double v = cashLoan();

    }
    private static double cashLoan (){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please insert amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Please insert number of installments: ");
        double installments = scanner.nextDouble();

        if (100<amount&& amount<10000&& 6<installments&& installments<48){
            double rata = (amount/installments);
            double rata2 = rata +rata*0.05;
            System.out.println("Single instalment: "+rata2);
            }


        return 0;
    }
}
