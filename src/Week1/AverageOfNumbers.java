package Week1;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        int until, count=0, sum=0;
        float average;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        until = input.nextInt();

        for (int i=1;i<until;i++) {
            if (i%3==0 || i%4==0) {
                sum += i;
                count++;
            }
        }

        average = (float) sum / (count);
        System.out.print("Result is: "+average);

    }

}
