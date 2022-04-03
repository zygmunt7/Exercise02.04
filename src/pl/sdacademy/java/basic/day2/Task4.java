package pl.sdacademy.java.basic.day2;

public class Task4 {
    public static void main(String[] args) {
        String input = "Ala ma kota. Kot ma Ale";
        String result = replaceString(input);
        System.out.println(result);

    }
    private static String replaceString (String input){
        if(StrinhHelper.isValid(input)){
           /* return input
                    .replace(".","-STOP-")
                    .replace(".","-STOP-");*/
            return input.replaceAll("[.,]", "-STOP-");
        }
        return input;
    }
}
