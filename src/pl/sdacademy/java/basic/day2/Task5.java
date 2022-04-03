package pl.sdacademy.java.basic.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'a';

        System.out.println(numbersOfLeters(input, letter));

    }
    private static int numbersOfLeters(String input, char serchedCharacter){
        int counter = 0;
        if(StrinhHelper.isValid(input) && input.contains(String.valueOf(serchedCharacter))) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == serchedCharacter) {
                    counter++;
                }
            }
            }

        return counter;

    }
}
