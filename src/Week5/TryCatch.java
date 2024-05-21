package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatch {

    static int[] intArr = new int[10];
    static Scanner input = new Scanner(System.in);
    static int userIndex;

    public static void main(String[] args) {

        getIndex();
    }

    // For make array
    static void makeArr(int[] arr) {
        for (int i=1;i<=arr.length;i++) {
            System.out.print("Enter the "+i+". num: ");
            int each = input.nextInt();
            arr[i-1]=each;
        }
        System.out.println("Array is: "+Arrays.toString(arr));
    }

    // It checks if user index is in array or not
    static void getIndex() {
        makeArr(intArr);
        System.out.print("Enter the index: ");
        userIndex = input.nextInt();
        try {
            for (int i : intArr) {
                if (intArr[userIndex] == i) {
                    System.out.println("The number of "+userIndex+". index of array is "+i);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
