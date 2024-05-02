package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class AverageCalc {

    static int[] list;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many elements do you want the array to have?: ");
        harmonicAvg(input.nextInt());
    }

    static void addNumbers(int arrLength) {

        list = new int[arrLength];
        System.out.printf("Please enter %s numbers for create array.\n",arrLength);
        for (int i=0,j=1;i<list.length;i++,j++) {
            System.out.printf("Enter the %s. num: ",j);
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));
    }

    static void harmonicAvg(int arrLength) {
        addNumbers(arrLength);
        double average, botSum=0;
        for (int num:list) {
            botSum += 1.0/num;
        }
        average = list.length/botSum;
        System.out.println("Harmonic Average is: "+average);
    }

}
