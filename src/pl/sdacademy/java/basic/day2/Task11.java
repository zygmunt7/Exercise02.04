package pl.sdacademy.java.basic.day2;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(isPalindrome(input));

        input = "programowanie";
        System.out.println(isPalindrome(input));

    }
    public static boolean isPalindrome(String input){
        String inputAfterReverse = new StringBuilder(input).reverse().toString();
        return input.equals(inputAfterReverse);
    }
}
