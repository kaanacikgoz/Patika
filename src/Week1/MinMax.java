package Week1;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        //We define variables here.
        int userInput, number, min=Integer.MAX_VALUE, max=0;

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        userInput = input.nextInt();

        //We print numbers with for loops and compare these with if blocks
        for (int i=1;i<=userInput;i++) {

            System.out.printf("%s. Sayıyı giriniz: ",i);
            number = input.nextInt();

            if (min>number) {
                min = number;
            }

            if (max<number) {
                max = number;
            }
        }

        //We print the biggest and smallest numbers here.
        System.out.println("The biggest number: "+max);
        System.out.print("The smallest number: "+min);
    }
}
