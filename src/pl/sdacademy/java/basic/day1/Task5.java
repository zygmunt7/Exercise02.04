package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please insert ferst digit: ");
        int ferstDigit = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        int sum = OfTheSequence(ferstDigit, secondDigit);
        System.out.println("Sum" +sum);
    }

    private static int OfTheSequence(int ferstDigit, int secondDigit) {
        int sum = 0;
      //  for (int i = ferstDigit; i<=secondDigit; i++){
      //      sum+=i;
   //     }
       // for (;ferstDigit<=secondDigit;ferstDigit++){
         //   sum +=ferstDigit;
    //    while (ferstDigit<=secondDigit){
      //      ferstDigit++;
  //      }
           /* do {
                sum+=ferstDigit;
                ferstDigit++;
            }while (ferstDigit<=secondDigit){


        }*/
        return sum;
    }
}
