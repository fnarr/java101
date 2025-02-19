import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3, select, balance = 1500;

        while (right > 0){
            System.out.print("Kullanıcı adınızı girin: ");
            userName = inp.nextLine();
            System.out.print("Parolanızı girin: ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){


                do {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Merhaba " + userName + ", Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1.Para Yatırma\n2.Para Çekme\n3.Bakiye Sorgulama\n4.Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçin: ");
                    select = inp.nextInt();
                    int price;
                    switch (select){
                        case 1:
                            System.out.println("--------------------------------------------------------------");
                            System.out.print("Para miktarı: ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("--------------------------------------------------------------");
                            System.out.print("Para miktarı: ");
                            price = inp.nextInt();
                            if (price > balance){
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                --right;
                if (right != 0){
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Kullanıcı adı veya parola hatalı. Tekrar deneyiniz.");
                    System.out.println("Kalan deneme hakkı: " + right);
                    System.out.println("--------------------------------------------------------------");
                }else {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    System.out.println("--------------------------------------------------------------");
                }

            }
        }


    }
}