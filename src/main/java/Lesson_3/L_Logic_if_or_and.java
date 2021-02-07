package Lesson_3;

public class L_Logic_if_or_and {
    public static void main(String[] args) {
        int age = 30;
        int money = 100;

        //if (age < 18 && (age > 10 || money < 50))
        // && fails on false
        // || fails on true

        if (age < 18 && money > 50) {
            System.out.println("Go to school and buy an ice-cream");
        }
        else if (age < 60 || money > 100) {
            System.out.println("Go to work and buy a car");
        }
        else {
            System.out.println("Go to vacation");
        }
    }
}
