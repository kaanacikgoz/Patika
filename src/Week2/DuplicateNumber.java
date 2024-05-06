package Week2;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] inputList = {4,1,2,3,6,2,4,1,5,6,8,8};
        System.out.println(Arrays.toString(evenArray(inputList)));
    }

    static int[] evenArray(int[] list) {
        int[] evenArr = new int[list.length];
        int index=0;
        for (int i=0;i<list.length;i++) {
            for (int j=0;j<list.length;j++) {
                if (i!=j && list[i]==list[j]&&list[i]%2==0) {
                    evenArr[index++] = list[i];
                }
            }
        }
        //System.out.println(Arrays.toString(evenArr));
        int index2=0;
        for (int i=0;i<evenArr.length;i++) {
            for (int j=0;j<evenArr.length;j++) {
                if (i!=j&&evenArr[i]==evenArr[j]) {
                    evenArr[j]=0;
                }
            }
        }
        return evenArr;
    }

}
