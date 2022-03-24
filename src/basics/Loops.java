package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an item from the list below: ");
            System.out.println("___________________________________");
            System.out.println("1. Hot dog");
            System.out.println("2. Hamburger");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Veggie burger");
            System.out.println("5. Coffee");
            option = scanner.nextInt();
        } while (option != 1 && option !=2 && option !=3 && option !=4 && option !=5 );
        switch (option){
            case 1:
                System.out.println("You chose a hot dog, that is €1.00");
                break;
            case 2:
                System.out.println("You chose a hamburger, that is €2.50");
                break;
            case 3:
                System.out.println("You chose a cheeseburger, that is €3.00");
                break;
            case 4:
                System.out.println("You chose a veggie burger, that is €3.25");
                break;
            case 5:
                System.out.println("You chose a coffee, that is €1.75");
                break;
            default:
                System.out.println("Have a good day, bye!");
        }
    }

}
