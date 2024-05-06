package Week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        guessNumber();
    }

    static void guessNumber() {
        int right=6, index=0, randomNum = random.nextInt(100);
        int[] wrongArray = new int[right];
        boolean isWin=false;
        while (0<right) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            if (guess < 100 && guess >= 0) {
                if (guess == randomNum) {
                    System.out.println("Congrats! The number is " + randomNum);
                    isWin = true;
                    break;
                } else {
                    right--;
                    System.out.printf("Left %s live\n", right);
                    wrongArray[index] = guess;
                    index++;
                    if (right==0) {
                        System.out.println("You Lost!");
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
        if (!isWin) {
            System.out.println("Right answer is: "+randomNum);
        }
        System.out.print("Wrong choices: "+Arrays.toString(wrongArray));
    }

}
