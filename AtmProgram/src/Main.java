import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500, select, withDraw;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = scan.nextLine();
            System.out.print("Şifreniz : ");
            password = scan.nextLine();
            if (userName.equals("hasan") && password.equals("1234")) {
                System.out.println("Giriş Yapıldı.");
                break;
            } else {
                System.out.println("Kullanıcı adı veya şifre hatalı.Tekrar deneyiniz.");
                right--;
                System.out.println("Kalan Hakkınız : " + right);
                if (right == 0) {
                    System.out.println("Kartınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
            }
        }
        do {
            System.out.print("Yapmak istediğiniz işlemi seçiniz.\n"
                    + "1 - Para yatırma\n"
                    + "2 - Para çekme\n"
                    + "3 - Bakiye sorgulama\n"
                    + "4 - Çıkış yap\n"
                    + " Seçiminiz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Yatırmak isteğiniz tutar : ");
                    int deposit = scan.nextInt();
                    balance+=deposit;
                    System.out.println("Yeni Bakiye : " + balance);
                    break;
                case 2:
                    do {
                        System.out.print("Çekmek istediğiniz tutar : ");
                        withDraw=scan.nextInt();
                        if(withDraw<balance){
                            balance-=withDraw;
                            System.out.println("Güncel Bakiyeniz : "+ balance);
                        }else{
                            System.out.println("Yetersiz Bakiye!\n"+"Çekilebilir Bakiye: "+ balance);
                        }
                    }while (withDraw>balance);
                    break;
                case 3:
                    System.out.println("Güncel Bakiyeniz : "+ balance);
                    break;
                case 4:
                    System.out.println("İyi Günler Dileriz.");

            }
        }while (select != 4) ;


    }
}