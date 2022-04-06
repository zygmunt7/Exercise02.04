package pl.sdacademy.java.basic.day2;

public class Task14 {
    public static void main(String[] args) {
        int [] inputs ={12, -7,19,-5};
        int result = displayArraysOnlyMinus(inputs);
        if(result>0){

        }


    }
    private static int displayArraysOnlyMinus (int[]inputs){
        int counter =0;
        for (int element : inputs){
            if (element<0){
                counter++;
            }
        }
        return 0;
    }
    private static int[] reateNewArrayWithNegativeValues (int[]inputs, int result){
        int[] result2 = new int[result];
        for (int i =0; i<inputs.length; ){
            if(inputs[i]<0){
                result2[i] = inputs[i];
                i++;
            }
        }
        return null;
    }
}
