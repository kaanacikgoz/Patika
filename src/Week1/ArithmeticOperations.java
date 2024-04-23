package Week1;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the a: ");
        int a = input.nextInt();

        System.out.print("Enter the b: ");
        int b = input.nextInt();

        System.out.print("Enter the c: ");
        int c = input.nextInt();

        int result = a+b*c-b;
        System.out.println(result);

    }

}
