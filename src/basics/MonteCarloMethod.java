package basics;

import java.util.Scanner;

public class MonteCarloMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a value for n, n = ");
        int number = scanner.nextInt();

        int k=0;
        for(int i=1; i<=number; i++){
            double x=Math.random();
            double y=Math.random();
            if((x*x)+(y*y) <= 1)
                k++;
        }

        double p = 4.*k/number;
        System.out.println(p);

    }
}
