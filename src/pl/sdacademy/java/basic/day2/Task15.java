package pl.sdacademy.java.basic.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray= {"Ala", "ma", "kota","koty0"};

        System.out.println(isThisSameArray(firstArray, secondArray));


    }
    private static boolean isThisSameArray(String[]firstArray, String[]secondArray) {

        if (firstArray.length == secondArray.length) {
            return false;


        }
        return false;

    }
}
