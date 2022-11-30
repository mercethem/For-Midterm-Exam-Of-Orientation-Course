import java.util.Scanner;

public class MidtermExam7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter perimeter for calculating : ");
        double perimeter = keyboard.nextDouble();
        double cevre;
        cevre = 2 * Math.PI * perimeter;
        System.out.println(cevre);
    }
}
