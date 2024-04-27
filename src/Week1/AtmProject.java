package Week1;

import java.util.Scanner;

public class AtmProject {

    public static void main(String[] args) {

        String username, password;
        int right = 3, balance = 1500, select, price;

        Scanner input = new Scanner(System.in);

        while (right > 0) {

            System.out.println();

            System.out.print("Your username: ");
            username = input.nextLine();
            System.out.print("Your password: ");
            password = input.nextLine();

            System.out.println();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println();
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    System.out.println();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            right = 0;
                            break;
                        default:
                            System.out.println("Wrong input!");
                    }
                } while (select != 4);
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}