package pl.sdacademy.java.basic.day2;

import org.w3c.dom.css.Counter;

public class Task7 {
    public static void main(String[] args) {
        Task7 spaceSign = new Task7();
        double sign = spaceSign.percentSpaceSign("Ala ma kota", " ");

        System.out.println("ilość spacji: "+sign);
    }
    private static double percentSpaceSign (String input, String space){
     /*   int counter = serchedCharacter.length -1;
        int counter2 = input.length();
        double sum =((double) counter/(double) counter2)*100;
        System.out.println(sum);
*/
        int counter3 = input.length();
        System.out.println(counter3);
        int sum = 0;
        for (int i=0; i<input.length(); i++){
            char mark = input.charAt(i);
            String mark2 = String.valueOf(mark);
            if (space.equalsIgnoreCase(mark2)){
                sum++;
            }
        }



        return 0;
    }
}
