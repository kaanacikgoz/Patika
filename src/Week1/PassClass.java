package Week1;

import java.util.Scanner;

public class PassClass {

    public static void main(String[] args) {

        /* I assigned the number of lessons to this variable
           because incorrectly entered lessons grades will be reduced by 1
           preventing them from being included in the average. */
        int numberOfLessons = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mathematics grade: ");
        int math = input.nextInt();

        /*If the grade is entered incorrectly, set it equal to
          zero and deduct it from the lessons count. */
        if (math<0 || math>100) {
            math = 0;
            numberOfLessons -= 1;
        }

        System.out.print("Enter the physic grade: ");
        int phy = input.nextInt();

        if (phy<0 || phy>100) {
            phy = 0;
            numberOfLessons -= 1;
        }

        System.out.print("Enter the literature grade: ");
        int lit = input.nextInt();

        if (lit<0 || lit>100) {
            lit = 0;
            numberOfLessons -= 1;
        }

        System.out.print("Enter the chemistry grade: ");
        int chem = input.nextInt();

        if (chem<0 || chem>100) {
            chem = 0;
            numberOfLessons -= 1;
        }

        System.out.print("Enter the music grade: ");
        int music = input.nextInt();

        if (music<0 || music>100) {
            music = 0;
            numberOfLessons -= 1;
        }

        int average = (math+phy+lit+chem+music)/numberOfLessons;

        System.out.println("Your average is: "+average);

        if (average>=55) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }


    }

}
