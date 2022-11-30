import java.util.Scanner;

public class MidtermExam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number for avarage calculation : ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double avarage = (number1 + number2 + number3) / 3;
        System.out.println("Your avarage calculation : " + avarage);
    }
}