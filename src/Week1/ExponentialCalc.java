package Week1;

import java.util.Scanner;

public class ExponentialCalc {

    public static void main(String[] args) {

        int firstNum, secondNum, result=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        firstNum = input.nextInt();

        System.out.print("Enter the second num: ");
        secondNum = input.nextInt();

        for (int i=0;i<secondNum;i++) {
            result *= firstNum;
        }

        if (secondNum<0) {
            System.out.print("Second number can't be minus!");
        } else {
            System.out.printf("%s^%s = "+result, firstNum, secondNum);
        }

    }

}
