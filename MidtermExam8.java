import java.util.Scanner;

public class MidtermExam8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        double number = keyboard.nextDouble();
        double calculate = Math.random() * number;
        System.out.println("Your number is changed and this number is your new number :) " + calculate +
                            " take it your new number. :)) ");
    }
}
