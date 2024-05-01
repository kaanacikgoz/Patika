package Week2;

import java.util.Scanner;

public class PatternMethod {

    //Global variables
    static int userInput;
    static boolean choose = false;

    public static void main(String[] args) {

        //Input Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num: ");
        userInput = input.nextInt();

        patternMethod(userInput);
    }

    /*
    choose diye bir değişken tanımladım ve bunun içine kodu yazdım çünkü bunsuz yaparsanız
    sayı 5-5 azaldıgında 0 veya eksi bir sayıya geçince 5 artıyordu ama sonra yine 5 azalıyordu
    böylece infinity bir loop oluşuyordu. For example: (0,5,0,5...) or (1,-4,1,-4...)
    bunun önüne geçebilmek için bu choose değişkenini tanımladım ve girilen sayı 0 veya eksi
    oldugunda sadece artma döngüsüne girecek böylece giris yapılan degere ulasilabilecek.
     */
    public static int patternMethod(int methodNum) {
        if (choose) {
            if (methodNum == userInput) {
                System.out.print(methodNum+" ");
                return methodNum;
            }
            System.out.print(methodNum+" ");
            return patternMethod(methodNum + 5);
        } else {
            if (methodNum<=0) {
                choose = true;
                return patternMethod(methodNum);
            }
            System.out.print(methodNum+" ");
            return patternMethod(methodNum - 5);
        }
    }
}
