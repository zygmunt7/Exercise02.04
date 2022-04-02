package pl.sdacademy.java.basic.day1;

public class Task8 {
    public static void main(String[] args) {
        int first = 0;
        int last = 10;
        for (int i = first; i<=last; i++) {
            if (primeNumber(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean primeNumber (int number){
        if (number<2){
            return false;
        }
        for (int i =2; i<=number; i++){
                    if(number%i ==0){
                        return false;
                    }
                }
                return true;
            }
}
