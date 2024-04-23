package Week1;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        int a,b,c; float u; double areaOfSquare,area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first length of triangle: ");
        a = input.nextInt();

        System.out.print("Enter the second length of triangle: ");
        b = input.nextInt();

        System.out.print("Enter the third length of triangle: ");
        c = input.nextInt();

        u = (a+b+c) / 2f;

        areaOfSquare = u*(u-a)*(u-b)*(u-c);
        area = Math.sqrt(areaOfSquare);

        String formattedArea = String.format("%.2f", area);
        System.out.println("Area of Triangle is = "+formattedArea);
    }

}
