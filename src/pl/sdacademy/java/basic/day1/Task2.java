package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;
    public static void main(String[] args) {
        float radius = getDiamiterFromUser()/2;
        float circumference =  calculateCirumFerenceOfACircle(radius);
        float area = areaOfCircle(radius);

        
        System.out.println("Circum: "+ calculateCirumFerenceOfACircle(radius));
        System.out.println("Area: " +area);
    }
    private static float getDiamiterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert Diamiter: ");
       /* float diamiter = scanner.nextFloat();
        return 0;*/
        return scanner.nextFloat();
    }
    private static float calculateCirumFerenceOfACircle(float radius){
        return 2*(float)Math.PI*radius;
        //return 2*PI*radius;
    }
    private static float areaOfCircle(float radius){
        return (float) (Math.PI *Math.pow(radius,2));
        //return PI *radius*radius;
    }
}
