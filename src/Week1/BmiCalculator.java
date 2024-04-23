package Week1;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        float  bmi,height,weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height(m): ");
        height = input.nextFloat();

        System.out.print("Please enter your weight(kg): ");
        weight = input.nextFloat();

        bmi = weight / (height*height);
        String formattedBmi = String.format("%.2f",bmi);

        System.out.println("Your bmi is: "+formattedBmi);
    }

}
