package Week1;

import java.util.Scanner;

public class TaximeterCalculator {

    public static void main(String[] args) {

        int startPrice=10,minPrice=20;float priceOfKm =2.20f,totalKm,totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("How many km do you want to go?: ");
        totalKm = input.nextFloat();

        totalPrice = startPrice + totalKm*priceOfKm;

        if (totalKm>=0 && totalPrice<20) {
            System.out.println("You should pay "+minPrice+" TL");
        }else if (totalKm>=0) {
            System.out.println("You should pay: "+totalPrice+" TL");
        } else {
            System.out.println("You can't enter minus km!");
        }
    }

}
