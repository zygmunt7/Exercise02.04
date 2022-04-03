package pl.sdacademy.java.basic.day2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'a';

        System.out.println(indexOfNumber(input, letter));

    }
    private static int indexOfNumber (String input, char searchedCharacer){
        int counter = 0;
        if (StrinhHelper.isValid(input)){
           return input.indexOf(searchedCharacer);
        }
        return -1;
    }
}
