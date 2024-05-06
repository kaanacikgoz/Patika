package Week2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class PalindromicWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        System.out.println(isPalindromic(input.next()));
    }

    static boolean isPalindromic(String word) {
        String reverse="";
        for (int i=word.length()-1;i>=0;i--) {
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }

}
