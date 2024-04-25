package Week1;

import java.util.Scanner;

public class LeapYearCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taken input by user
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //Nested if-else blocks for calculate leap year
        if (year>=0) {
            if (year%4==0) {
                if (year%100==0) {
                    if (year%400==0) {
                        System.out.printf("%s is leap year!",year);
                    } else {
                        System.out.printf("%s is not leap year!",year);
                    }
                } else {
                    System.out.printf("%s is leap year!",year);
                }
            } else {
                System.out.printf("%s is not leap year!",year);
            }
        }  else {
            System.out.print("Wrong Input!");
        }

    }

}
