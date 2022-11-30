import java.util.Scanner;

public class MidtermExam6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter perimeter for area calculating: ");
        double perimeter = keyboard.nextDouble();
        double area;
        area = perimeter * perimeter *Math.PI;
        System.out.println(area);
    }
}
