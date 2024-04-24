package Week1;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        //We define project's variables here
        String username,password,newPassword;

        Scanner input = new Scanner(System.in);

        //We get user's information
        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        //Using if-else for conditions
       if (username.equals("patika") && password.equals("java123")) {
           System.out.println("You have successfully logged in");
       } else {
           System.out.println("Login failed!");

           System.out.print("Do you want to change your password? / Y or N ");
           String changePassword = input.nextLine().toUpperCase();

           //Nested if-else statements
           if (changePassword.equals("Y")) {
               System.out.print("Enter your new password: ");
               newPassword = input.nextLine();
               if (newPassword.equals("java123")) {
                   System.out.println("The password could not be created, please enter another password.");
               } else {
                   System.out.println("New password created");
               }
           }

       }


    }

}
