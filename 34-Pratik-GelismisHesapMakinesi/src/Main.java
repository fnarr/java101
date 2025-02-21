import java.util.Scanner;

public class Main {

    static void plus(){
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void minus() {
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void times() {
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            result *= number;
        }
        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void divided() {
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void power() {
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void factorial() {
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void mode(){
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Modunu alcağınız sayıyı girin: ");
        int n = scan.nextInt();
        System.out.print("Bölmek istediğiniz sayıyı girin: ");
        int divideN = scan.nextInt();
        int result = n % divideN;

        System.out.println("---------------------------------");
        System.out.println("Sonuç: " + result);
        System.out.println("---------------------------------");
    }

    static void rectangle(){
        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        int shortSide, longSide, perimeter, area;
        System.out.print("Kısa kenar uzunluğu: ");
        shortSide = scan.nextInt();
        System.out.print("Uzun kenar uzunluğu: ");
        longSide = scan.nextInt();
        perimeter = 2 * (shortSide + longSide);
        area = shortSide * longSide;
        System.out.println("---------------------------------");
        System.out.println("Dikdörtgenin Çevresi: " + perimeter);
        System.out.println("Dikdörtgenin Alanı: " + area);
        System.out.println("---------------------------------");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}