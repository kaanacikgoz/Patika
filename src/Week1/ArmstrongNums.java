package Week1;

import java.util.Scanner;

public class ArmstrongNums {
    public static void main(String[] args) {

        int userInput, sum=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        userInput = input.nextInt();

        while (userInput != 0) {
            sum += userInput % 10; // It takes the last digit and adds to sum variable.
            userInput /= 10; // Subtracts the last digit from the number taken by user.
        }

        System.out.println("Sonuc: "+sum);

    }

}
