package pl.sdacademy.java.basic.day2;

public class Task8 {
    public static void main(String[] args) {
        String input = "AlA Ma kOtA";
        String result = replaceChars(input);
        System.out.println(result);

    }
    private static String replaceChars(String input){
        if (StrinhHelper.isValid(input)){
            String result ="";
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<input.length(); i++){
                char currentChar = input.charAt(i);
                if (currentChar>=65 && currentChar<=90){
                    result+= result+(char)(currentChar+32);
                }else if (currentChar>=97 && currentChar <=122){
                    result+= result+(char)(currentChar-32);
                }    else {
                    result += currentChar;

                }
            }
            return result;
            }

        return input;

    }
}
