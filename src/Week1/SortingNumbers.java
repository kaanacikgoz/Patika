package Week1;

import java.util.Scanner;

public class SortingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int first = input.nextInt();

        System.out.print("Enter the second num: ");
        int second = input.nextInt();

        System.out.print("Enter the third num: ");
        int third = input.nextInt();

        if (first<second && first<third) {
            if (second<third) {
                System.out.print("first<second<third");
            } else {
                System.out.print("first<third<second");
            }
        } else if (second<first && second<third) {
            if (first<third) {
                System.out.print("second<first<third");
            } else {
                System.out.print("second<third<first");
            }
        } else {
            if (first<second) {
                System.out.print("third<first<second");
            } else {
                System.out.print("third<second<first");
            }
        }
    }

}
