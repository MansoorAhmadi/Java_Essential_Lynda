package basics;

import basics.methods.Methods;

import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age: ");
        int age = scanner.nextInt();

        Methods methods = new Methods();
        methods.ageDecision(age);
    }
}
