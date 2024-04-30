package Week2;

import java.util.Scanner;

public class ExponentialCalc {

    public static void main(String[] args) {
        int baseNum, upperNum=0;
        Scanner input = new Scanner(System.in);

        //I used while loop for to get input until upperNum will be negative.
        while (upperNum >= 0) {
            System.out.print("Enter the base num: ");
            baseNum = input.nextInt();
            System.out.print("Enter the upper num: ");
            upperNum = input.nextInt();

            /* If upperNum is negative then loop end with print "Wrong Input"
            and I used if-else block here because to escape from infinity loop
            in my exponential method because in case the upperNum becomes negative. */
            if (upperNum<0) {
                System.out.print("Wrong Input");
            } else {
                System.out.println("The result is: " + exponentialCalc(baseNum, upperNum));
            }
        }
    }
    //Recursive method for calculate exponential
    public static int exponentialCalc(int base, int upper) {
        if (upper == 0) {
            return 1;
        } else {
            return base * exponentialCalc(base, upper - 1);
        }
    }

}
