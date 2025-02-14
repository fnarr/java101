import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int select;
        String userName, password;

        System.out.print("Kullanıcı adınızı girin: ");
        userName = sc.nextLine();

        System.out.print("Şifrenizi girin: ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Başarılı");
        }else if (userName.equals("patika")){
            System.out.print("Şifrenizi mi unuttunuz? Sıfırlamak ister misiniz?\n1.Evet\n2.Hayır\nYapmak istediğiniz işlemi seçin: ");
            select = sc.nextInt();
            if(select == 1){
                sc.nextLine();
                System.out.print("Yeni şifrenizi girin: ");
                String nPassword = sc.nextLine();

                if (nPassword.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    password = nPassword;
                    System.out.print("Şifre oluşturuldu.");
                }
            }else if(select == 2){
                System.out.print("Şifre hatalı giriş başarısız");
            }else {
                System.out.print("Geçersiz işlem girdiniz.");
            }
        }else{
            System.out.print("Kullanıcı adı ve şifre hatalı.");
        }
    }
}