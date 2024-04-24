package Week1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //We get numbers from the user.
        System.out.print("Enter the first num: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second num: ");
        int secondNum = input.nextInt();

        //We ask the user which operation wants to use.
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");

        System.out.print("Your choice is: ");
        int choice = input.nextInt();

        //Switch case structure was used for the conditions.
        switch (choice) {
            case 1:
                System.out.println("Result is: "+(firstNum+secondNum));
                break;
            case 2:
                System.out.println("Result is: "+(firstNum-secondNum));
                break;
            case 3:
                System.out.println("Result is: "+(firstNum*secondNum));
                break;
            case 4:
                if (secondNum == 0) {
                    System.out.println("Numbers cannot be divided by 0!");
                    break;
                }
                System.out.println("Result is: "+(firstNum/secondNum));
                break;
            default:
                System.out.println("You did wrong choice!");
        }
    }

}
