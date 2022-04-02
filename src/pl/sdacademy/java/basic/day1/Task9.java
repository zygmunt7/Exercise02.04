package pl.sdacademy.java.basic.day1;

public class Task9 {
    public static void main(String[] args) {
        int rangefrom =0;
        int rageto =20;
        for (int i=rangefrom; i<=rageto;i++){
            System.out.println(fizzBuzz(i));

        }

    }

    private static String fizzBuzz(int number) {
        if (number%15==0){
            return "FizzBuzz";
        }
        if (number%3 ==0){
            return "Fizz";
        }
        if (number%5==0){
            return "Buzz";
        }
        return String.valueOf(number);
    }


}
