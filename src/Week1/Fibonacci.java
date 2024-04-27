package Week1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        //We define variables
        int secondNum=1, result=0;

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of fibonacci serie: ");
        int num = input.nextInt();

        //Fibonacci loop
        for (int firstNum=0;num!=0;num--) {
            System.out.print(firstNum+" ");
            result = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = result;
        }

    }

}
