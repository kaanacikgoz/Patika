package Week1;

import java.util.Scanner;

public class TriangleWithStars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int n = input.nextInt();

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=n-1;i++) {
            for (int j=n-i+1;j<=n;j++) {
                System.out.print(" ");
            }
            for (int k=2*n-i;i<=k-2;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
