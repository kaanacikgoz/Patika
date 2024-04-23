package Week1;

import java.util.Scanner;

public class GreengrocerPriceCalculator {

    public static void main(String[] args) {

        float perPear=2.14f,perApple=3.67f,perTomatoes=1.11f,perBanana=0.95f,perEggplant=5;
        float pear,apple,tomatoes,banana,eggplant,total;

        Scanner input = new Scanner(System.in);

        System.out.print("How much kg pear do you want to buy?: ");
        pear = input.nextFloat();

        System.out.print("How much kg apple do you want to buy?: ");
        apple = input.nextFloat();

        System.out.print("How much kg tomatoes do you want to buy?: ");
        tomatoes = input.nextFloat();

        System.out.print("How much kg banana do you want to buy?: ");
        banana = input.nextFloat();

        System.out.print("How much kg eggplant do you want to buy?: ");
        eggplant = input.nextFloat();

        total = pear*perPear+apple*perApple+tomatoes*perTomatoes+banana*perBanana+eggplant*perEggplant;
        System.out.print("Total price is: "+total);
    }

}
