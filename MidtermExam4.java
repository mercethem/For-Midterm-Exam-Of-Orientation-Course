import java.util.Scanner;

public class MidtermExam4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your score : ");
        double grade = keyboard.nextDouble();
        if (grade >= 90) {
            System.out.println("Your Grade is AA ");
        } else if (grade >= 85 && grade < 90) {
            System.out.println("Your Grade is BA ");
        } else if (grade >= 80 && grade < 85) {
            System.out.println("Your Grade is BB ");
        } else if (grade >= 70 && grade < 75) {
            System.out.println("Your Grade is CB ");
        } else {
            System.out.println("Your grade FF!!");
        }
    }
}