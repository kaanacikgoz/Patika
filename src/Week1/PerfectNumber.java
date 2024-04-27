package Week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //We define variables here.
        int sum=0, number;

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        number = input.nextInt();

        //We used for loop to find the factors of the number.
        for (int i=1;i<number;i++) {
            if (number%i==0) {
                sum += i;
            }
        }

        //We find number is perfect or not with if-else block
        if (sum==number) {
            System.out.print(number+" is a perfect number.");
        } else {
            System.out.print(number+" is not a perfect number.");
        }

    }

}
