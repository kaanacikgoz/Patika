package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    static int listLength;
    static int[] list;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many elements in array do you want?: ");
        listLength = input.nextInt();
        findMinMax();
    }

    static void createArray() {
        list = new int[listLength];
        for (int i=0;i< list.length;i++) {
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));
    }

    static void findMinMax() {
        createArray();
        System.out.print("Enter the num: ");
        int userNum = input.nextInt();
        int min=0, max=Integer.MAX_VALUE;
        for (int num:list) {
            if (num<userNum && num>min) {
                min = num;
            }
            if (num>userNum && num<max) {
                max = num;
            }
        }
        System.out.println("The nearest number less than the entered number: "+min);
        System.out.print("The nearest number greater than the entered number: "+max);
    }

}
