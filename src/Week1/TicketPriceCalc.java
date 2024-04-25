package Week1;

import java.util.Scanner;

public class TicketPriceCalc {

    public static void main(String[] args) {

        //Defined variables
        int km,age,travelType;
        final float PRICEOFKM = 0.10f;
        float ageDiscount=0,travelTypeDiscount=0,ticketPrice=0;
        float ticketPriceWithAgeDiscount,finalPrice;
        boolean isIncorrectData=false;

        Scanner input = new Scanner(System.in);

        //Taken inputs by user
        System.out.print("How many km will you go?: ");
        km = input.nextInt();

        System.out.print("How old are you?: ");
        age = input.nextInt();

        System.out.print("Please select your travel type? (1-One Way / 2-Round-trip): ");
        travelType = input.nextInt();

        //For 1 line space
        System.out.println();

        if (km >= 0) {
            ticketPrice = PRICEOFKM * km;
        } else {
            isIncorrectData = true;
        }


        //Age discount calculations
        if (age >= 0) {
            if (age <= 12) {
                ageDiscount = 0.5f;
            } else if (age <= 24) {
                ageDiscount = 0.1f;
            } else if (age >= 65) {
                ageDiscount = 0.3f;
            }
        } else {
            isIncorrectData = true;
        }

        ticketPriceWithAgeDiscount = ticketPrice -(ticketPrice*ageDiscount);

        //Travel type discount calculations
        if (travelType == 1) {
            travelTypeDiscount = 0;
        } else if (travelType == 2) {
            travelTypeDiscount = 0.2f;
        } else {
            isIncorrectData = true;
        }

        finalPrice = ticketPriceWithAgeDiscount - (ticketPriceWithAgeDiscount * travelTypeDiscount);

        if (travelType == 2) {
            finalPrice *= 2;
        }

        if (isIncorrectData) {
            System.out.print("You Entered Incorrect Data!");
        } else {
            System.out.println("Total price: "+finalPrice+" TL");
        }

    }

}
