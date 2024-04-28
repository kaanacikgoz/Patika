package Week1;

import java.util.Scanner;

public class PowOfTwo {

    public static void main(String[] args) {

        int userInput;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        userInput = input.nextInt();

        for (int i=0;i<=userInput;i++) {
            if (Math.pow(4,i)<=userInput)  {
                System.out.printf("4^%s<=%s\n",i,userInput);
            }
            if (Math.pow(5,i)<=userInput) {
                System.out.printf("5^%s<=%s\n",i,userInput);
            }
        }
    }
}
