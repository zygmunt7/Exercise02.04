package pl.sdacademy.java.basic.day2;

public class Task3 {
    public static void main(String[] args) {
        String input ="Ala ma kota";
        String word ="ma";
        int result = getIndex(input, word);
        System.out.println(result);
        word = "";
        result = getIndex(input, word);
        System.out.println(result);

    }
    private static int getIndex(String input, String word){
        if(StrinhHelper.isValid(input) && StrinhHelper.isValid(word)) {
            boolean result = input.contains(word);
            if (result){
                return input.indexOf(word);
            }
        }
        return -1;
    }
}
