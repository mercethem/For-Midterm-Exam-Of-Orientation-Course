import java.util.Scanner;

public class MidtermExam5 {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Please enter your fahrenheit : ");
        double fahrenheit = keyboard.nextDouble();
        double celcius;
        celcius= (fahrenheit - 32) * (5.0 / 9);
        System.out.println(fahrenheit + " fahrenheit is " + celcius + " celcius degree. ");

    }
}
