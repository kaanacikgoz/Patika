package Week1;

import java.util.Scanner;

public class CombinationCalc {

    public static void main(String[] args) {

        int firstNum, secondNum, result;
        int factorialOfFirstNum=1, factorialOfSecondNum=1, factorialOfDiff=1;
        final String NUM_ERROR="Wrong input!";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        firstNum = input.nextInt();

        System.out.print("Enter the second num: ");
        secondNum = input.nextInt();

        for (int i=1;i<=firstNum;i++) {
            factorialOfFirstNum *= i;
        }

        for (int i=1;i<=secondNum;i++) {
            factorialOfSecondNum *= i;
        }

        for (int i=1;i<=firstNum-secondNum;i++) {
            factorialOfDiff *= i;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        if (secondNum > 0 && firstNum >= secondNum) {
            result = factorialOfFirstNum / (factorialOfSecondNum*factorialOfDiff);
            System.out.printf("C(%s,%s) = %s",firstNum,secondNum,result);
        } else {
            System.out.printf("C(%s,%s) = %s",firstNum,secondNum,NUM_ERROR);
        }

    }

}
