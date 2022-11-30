import java.util.Scanner;

public class MidtermExam3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your money : ");

        double money = keyboard.nextDouble();
        int allCoins = (int) (money * 100);
        int dollars = allCoins / 100;
        allCoins %= 100;
        int cents25 = allCoins / 25;
        allCoins %= 25;
        int cents10 = allCoins / 10;
        allCoins %= 10;
        int cents5 = allCoins / 5;
        int cents1 = allCoins % 5;

        System.out.println("Your money is: " + dollars + " pieces dollars, " + cents25 + " pieces 25 cents " +
                            cents10 + " pieces 10 cents, " + cents5 + " pieces 5 cents, " + cents1 +" pieces " +
                            " 1 cents.");
    }
}
