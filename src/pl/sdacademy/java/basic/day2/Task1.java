package pl.sdacademy.java.basic.day2;

public class Task1 {
    public static void main(String[] args) {
        String input = "domek";
        char result = detLastChar(input);
        System.out.println(result);
    }
    private static char detLastChar(String input){
        if (input != null) {
            int lastPosition = input.length() - 1;
            return input.charAt(lastPosition);
        }
        return ' ';
    }
}
