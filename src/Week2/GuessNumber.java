package Week2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        guessNumber();
    }

    static void guessNumber() {
        int right=6, randomNum = random.nextInt(100);
        while (0<right) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            if (guess < 100 && guess >= 0) {
                if (guess == randomNum) {
                    System.out.println("Congrats! The number is " + randomNum);
                    break;
                } else {
                    right--;
                    System.out.printf("Left %s live\n", right);
                    if (right==0) {
                        System.out.print("You Lost!");
                        break;
                    }
                    if (guess>randomNum) {
                        System.out.println("Down!");
                    } else {
                        System.out.println("Up!");
                    }
                }
            } else {
                System.out.println("Please enter between 0-100 num!");
            }
        }
    }

}
