package basics;

public class LoanBalance {
    public static void main(String[] args) {

        /**
         * If you take a loan of €5000 and willing to pay €500 per month
         * How long will take you to pay it back ?
         */

        double loanBalance = 5000.00;
        int month = 0;
        while (loanBalance > 0){
            loanBalance = loanBalance - 500;
            month++;
        }
        System.out.println(month);
    }
}
