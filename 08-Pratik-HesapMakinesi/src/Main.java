import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, select, result;

        System.out.print("Birinci sayıyı girin: ");
        n1 = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        n2 = sc.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçin: ");
        select = sc.nextInt();

        switch (select){
            case 1:
                result = n1 + n2;
                System.out.print("Toplam: " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.print("Çıkarma: " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.print("Çarpma: " + result);
                break;
            case 4:
                if (n2 != 0){
                    result = n1 / n2;
                    System.out.print("Bölme: " + result);
                    break;
                }
                else{
                    System.out.print("Bir sayı sıfıra bölünemez!");
                    break;
                }
            default:
                System.out.print("Geçersiz bir işlem girdiniz");
        }
    }
}