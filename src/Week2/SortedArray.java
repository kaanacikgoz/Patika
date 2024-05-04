package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    static int[] list;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        createArray();
    }

    static void createArray() {
        System.out.print("How many elements do you want for create array?: ");
        list = new int[input.nextInt()];
        int index=0;
        for (int i=1;i<=list.length;i++) {
            System.out.printf("%s. number: ",i);
            int number = input.nextInt();
            list[index]=number;
            index++;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        //sortedArray();
    }

    /*
    static void sortedArray() {
        for (int i=0;i<list.length-1;i++) {
            for (int j=0;j<list.length-i-1;j++) {
                if (list[j]>list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
     */

}