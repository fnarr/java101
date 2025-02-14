import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican= 5.00, kgArmut, kgElma, kgDomates, kgMuz, kgPatlican, total;

        System.out.print("Armut Kaç Kilo ? : ");
        kgArmut = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        kgElma = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        kgDomates = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        kgMuz = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        kgPatlican = inp.nextDouble();

        total = (kgArmut * armut) + (kgElma * elma) + (kgDomates * domates) + (kgMuz * muz) + (kgPatlican * patlican);

        System.out.print("Toplam Tutar: " + total + " TL");
    }
}