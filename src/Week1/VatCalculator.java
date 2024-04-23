package Week1;

import java.util.Scanner;

public class VatCalculator {

    public static void main(String[] args) {

        float vat=0,price,priceWithVat,vatAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price please: ");
        price = input.nextFloat();

        if (price>0 && price<=1000) {
            vat = 0.18f;
        } else if (price>1000) {
            vat = 0.08f;
        }

        vatAmount = price*vat;
        System.out.println("Vat amount = " + vatAmount);

        priceWithVat = price + vatAmount;
        System.out.println("New price with vat = " + priceWithVat);
    }

}
