package Week1;

import java.util.Scanner;

public class SliceAreaOfCircle {

    public static void main(String[] args) {

        float r,angle,area; final float PI=3.14f;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        r = input.nextFloat();

        System.out.print("Enter the angle of circle: ");
        angle = input.nextFloat();

        area = (PI*r*r*angle)/360;
        String formattedArea = String.format("%.2f",area);

        System.out.println("Area of the circle is: "+formattedArea);
    }

}
