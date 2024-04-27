package Week1;

import java.util.Scanner;

public class InvertTriangle {

    public static void main(String[] args) {

        //We define variable
        int userInput;

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        userInput = input.nextInt();

        //Nested for loops
        for (int i=1;i<=userInput;i++) {
            for (int j=i;i+j<=2*userInput;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
