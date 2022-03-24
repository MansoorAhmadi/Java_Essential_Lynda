package basics;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello" + " " + name + ", " + "nice to meet you." + " " + "You are" + " " + age + " years old!");


    }
}

