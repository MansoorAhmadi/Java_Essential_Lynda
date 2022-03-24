package basics;

import basics.methods.Methods;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        Methods methods = new Methods();
        methods.introduction(name,age);


    }
}

