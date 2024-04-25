package Week1;

import java.util.Scanner;

public class SumOddNums {

    public static void main(String[] args) {

        int userInput=0, sum=0;

        Scanner input = new Scanner(System.in);

        while (userInput%2!=1) {
            System.out.print("Enter the num: ");
            userInput = input.nextInt();

            if (userInput % 2 == 0) {
                sum += userInput;
            }
        }

        System.out.print("Sum is: "+sum);
    }

}
