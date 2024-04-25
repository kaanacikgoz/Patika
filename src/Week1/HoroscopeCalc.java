package Week1;

import java.util.Scanner;

public class HoroscopeCalc {

    public static void main(String[] args) {

        String horoscope; final String ERROR = "Invalid Login!";

        Scanner input = new Scanner(System.in);

        System.out.print("Which month did you birth?: ");
        int month = input.nextInt();

        System.out.print("Which day did you birth?: ");
        int day = input.nextInt();

        if (month==1) {
            horoscope = (day>=1 && day<= 31) ? (day<22 ? "Capricorn" : "Aquarius") : ERROR;
        } else if (month==2) {
            horoscope = (day>=1 && day<=28) ? (day<20 ? "Aquarius":"Pisces") : ERROR;
        } else if (month==3) {
            horoscope = (day>=1 && day<=31) ? (day<21 ? "Pisces":"Aries") : ERROR;
        } else if (month==4) {
            horoscope = (day>= 1 && day<=30) ? (day<21 ? "Aries" : "Taurus") : ERROR;
        } else if (month==5) {
            horoscope = (day>=1 && day<=31) ? (day<22 ? "Taurus":"Gemini") : ERROR;
        } else if (month==6) {
            horoscope = (day>=1 && day<=30) ? (day<23 ? "Gemini":"Cancer") : ERROR;
        } else if (month==7) {
            horoscope = (day>=1 && day<=31) ? (day<23 ? "Cancer":"Leo") : ERROR;
        } else if (month==8) {
            horoscope = (day>=1 && day<=31) ? (day<23 ? "Leo":"Virgo") : ERROR;
        } else if (month==9) {
            horoscope = (day>=1 && day<=30) ? (day<23 ? "Virgo":"Libra") : ERROR;
        } else if (month==10) {
            horoscope = (day>=1 && day<=31) ? (day<23 ? "Libra":"Scorpio") : ERROR;
        } else if (month==11){
            horoscope = (day>=1 && day<=30) ? (day<22 ? "Scorpio":"Sagittarius") : ERROR;
        } else if (month==12) {
            horoscope = (day>=1 && day<=31) ? (day<22 ? "Sagittarius":"Capricorn") : ERROR;
        } else {
            horoscope = ERROR;
        }

        if (horoscope.equals(ERROR)) {
            System.out.print("Invalid Login!, Try again.");
        } else {
            System.out.print("Your horoscope is "+horoscope);
        }

    }

}
