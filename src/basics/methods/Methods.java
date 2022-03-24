package basics.methods;

public class Methods {

    /*
    Chapter 01 exercise
     */
    public void introduction(String name, int age){
        System.out.println("Hello" + " " + name + ", " + "nice to meet you." + " " + "You are" + " " + age + " years old!");
    }

    /*
    Chapter 03 - input an age to calculate your maturity
     */
    public void ageDecision(int age){
        if (age < 2){
            System.out.println("You're an infant!");
        } else if (age < 12){
            System.out.println("You're a child!");
        } else if (age < 18){
            System.out.println("You're a teen!");
        } else if (age < 40){
            System.out.println("You're an adult!");
        } else {
            System.out.println("You're a senior!");
        }
    }

}
