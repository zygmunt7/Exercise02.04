package pl.sdacademy.java.basic.day2;

public class StrinhHelper {
    public static boolean isValid(String input) {
//        if(input != null && !input.isBlank()) {
//            return true;
//        }
//        return false;
        // wyrażenie_logiczne ? operacja_1 : operacja_2;
        return input != null && !input.isBlank();
    }
}
