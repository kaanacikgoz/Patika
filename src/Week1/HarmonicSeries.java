package Week1;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {

        int userInput;
        double result=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        userInput = input.nextInt();

        for (double i=1;i<=userInput;i++) {
            result += (1/i);
        }

        System.out.print("Result is: "+result);

    }

}
