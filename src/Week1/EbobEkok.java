package Week1;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        int firstNum, secondNum, ebob=0, ekok, count=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        firstNum = input.nextInt();

        System.out.print("Enter the second num: ");
        secondNum = input.nextInt();

        while (count<=firstNum && count<=secondNum) {
            if (firstNum%count==0 && secondNum%count==0) {
                ebob = count;
            }
            count++;
        }

        ekok = (firstNum*secondNum)/ebob;
        System.out.println();

        System.out.println("Ebob of these numbers: "+ebob);
        System.out.print("Ekok of these numbers: "+ekok);
    }

}
