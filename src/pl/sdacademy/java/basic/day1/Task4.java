package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task4 {
    private static final Scanner scanner =new Scanner(System.in);
    private static final double BMI_MIN_RANGE = 18.5;
    public static final double BMI_MAX_RANGE = 24.9;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        float weight = getWeight(scanner);
        int high = (int) getHigh(scanner);
        float bmi = calculateBMI(weight, high);
        displayBmiRelut(bmi);

    }
    private static float getWeight (Scanner scanner){
        System.out.println("Please insert weight in kg: ");
        return scanner.nextFloat();

    }
    private static float getHigh (Scanner scanner) {
        System.out.println("Please insert height in cm: ");
       return scanner.nextInt();
    }
    private static float calculateBMI(float weight, int high) {
        float highInMeter = high/100F;
        return weight/(float)Math.pow(highInMeter, 2);
    }
    private static void displayBmiRelut(float bmi) {
        if (bmi< BMI_MIN_RANGE || bmi> BMI_MAX_RANGE){
            System.out.println("BMI is not correct: "+bmi);
        }else {
            System.out.println("BMI is correct: "+ bmi);
        }
    }
}
