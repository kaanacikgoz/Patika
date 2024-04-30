package Week2;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class PalindromeNumbers {

    static int temp, inputNum;
    static String sumOfStringDigits ="", printMessage;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        inputNum = input.nextInt();

        System.out.println(findPalindrome(inputNum));
    }

    /* Boolean type function for is this palindrome number or not!

    static boolean isPalindrome(int methodNum) {
        if (methodNum==0) {
            int example3 = Integer.parseInt(sumOfStringDigits);
            return example3==inputNum;
        } else {
            reverseNum = methodNum % 10;
            String example = Integer.toString(reverseNum);
            sumOfStringDigits += example;
            return isPalindrome(methodNum/10);
        }
    }

    */

    @NotNull
    static String findPalindrome(int methodNum) {
        if (methodNum==0) {
            int reverseNum = Integer.parseInt(sumOfStringDigits);
            if (reverseNum==inputNum) {
                printMessage = "This is a palindrome number.";
            } else {
                printMessage = "This is not a palindrome number.";
            }
        } else {
            temp = methodNum % 10;
            String intToStringDigits = Integer.toString(temp);
            sumOfStringDigits += intToStringDigits;
            return findPalindrome(methodNum/10);
        }
        return printMessage;
    }

}
