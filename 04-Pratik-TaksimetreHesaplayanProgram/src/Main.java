import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km;
        double perKm = 2.20, startPrice = 10, total;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = inp.nextInt();

        total = (km * perKm) + startPrice;
        total = (total < 20) ? 20 : total;

        System.out.print("Toplam Tutar: " + total);
    }
}