package Week1;

import java.util.Scanner;

public class TemperatureActivity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature of air: ");
        int temperature = input.nextInt();

        if (temperature<=5) {
            System.out.println("You can ski.");
        } else if (temperature<=25) {
            if (temperature<=15) {
                System.out.println("You can go to cinema.");
            } else {
                System.out.println("You can go to picnic.");
            }
        } else {
            System.out.println("You can swim.");
        }
    }

}
