package Week1;

import java.util.Scanner;

public class AverageNote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Mathematics' note: ");
        int math = input.nextInt();

        System.out.print("Enter the Physics' note: ");
        int phy = input.nextInt();

        System.out.print("Enter the Chemistry's note: ");
        int chem = input.nextInt();

        System.out.print("Enter the Literature's note: ");
        int lite = input.nextInt();

        System.out.print("Enter the History's note: ");
        int hist = input.nextInt();

        System.out.print("Enter the Music's note: ");
        int music = input.nextInt();

        input.close();

        float average = (math + phy + chem + lite + hist + music) / 6f;

        System.out.println("The average of the exams results is = " + average);

        String result = average>=60 ? "Pass": "Fail";
        System.out.println(result);
    }

}
