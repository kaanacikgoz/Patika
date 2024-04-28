package Week1;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        //We define variables
        int intNum, floatToIntNum;
        float floatNum, intToFloatNum;

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the int num: ");
        intNum = input.nextInt();

        System.out.print("Enter the float num: ");
        floatNum = input.nextFloat();

        //1 line spacing;
        System.out.println();

        //It converts to float from int
        intToFloatNum = intNum;
        System.out.println("Int to float: "+intToFloatNum);

        //It converts to int from float
        floatToIntNum = (int) floatNum;
        System.out.print("Float to int: "+floatToIntNum);


    }

}
