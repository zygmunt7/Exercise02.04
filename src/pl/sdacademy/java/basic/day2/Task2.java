package pl.sdacademy.java.basic.day2;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        boolean result = isWordContainsPrefix(input, prefix);
        System.out.println(result);

    }
    private static boolean isWordContainsPrefix (String input, String prefix){
        return input.startsWith(prefix);

    }
}
