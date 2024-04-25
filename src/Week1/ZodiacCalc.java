package Week1;

import java.util.Scanner;

public class ZodiacCalc {

    public static void main(String[] args) {

        //Define variables
        int year,remainder;
        String zodiac;

        Scanner input = new Scanner(System.in);

        //Taken input by user
        System.out.print("Enter your birthday: ");
        year = input.nextInt();

        remainder = year % 12;

        //Different switch-case syntax to calculate conditions
        zodiac = switch (remainder) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Mouse";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> "Wrong Input";
        };

        //Control for wrong input
        if (zodiac.equals("Wrong Input")) {
            System.out.print("Wrong Input, try again!");
        } else {
            System.out.print("Your Chinese Zodiac Sign: "+zodiac);
        }

    }

}
