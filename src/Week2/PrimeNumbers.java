package Week2;

import java.util.Scanner;

public class PrimeNumbers {

    static int userInput=2;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (userInput > 1) {
            System.out.print("Enter the num: ");
            userInput = input.nextInt();

            if (isPrimeNumber(userInput, userInput / 2)) {
                System.out.println(userInput + " is a prime number.");
            } else {
                System.out.println(userInput + " is not a prime number.");
            }
        }
    }

    public static boolean isPrimeNumber(int number, int divisor) {
        if (divisor==1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeNumber(number, divisor - 1);
    }
}
