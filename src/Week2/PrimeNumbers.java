package Week2;

import java.util.Scanner;

public class PrimeNumbers {
    //While dongusune girsin diye 2'ye eşitledim.
    static int userInput=2;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Bir inputtan sonra dongu devam etsin diye while kullandim.
        -1,0,1'de hata verdigi icin try-catch blogu ile daha guzel bir
        cikti elde ettim. */
        while (userInput > 1) {
            System.out.print("Enter the num: ");
            userInput = input.nextInt();
            try {
                if (isPrimeNumber(userInput, userInput / 2)) {
                    System.out.println(userInput + " is a prime number.");
                } else {
                    System.out.println(userInput + " is not a prime number.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //Recursive method ile girilen sayinin asal olup olmadıgını bulma
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
