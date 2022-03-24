package basics;

public class OddNumbers {
    public static void main(String[] args) {

        /**
         * Print the odd numbers between 1 and 100
         */

        for (int i=0; i<100; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
}
