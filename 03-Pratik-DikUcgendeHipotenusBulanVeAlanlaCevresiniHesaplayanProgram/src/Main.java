import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int akenar,bkenar;
        double ckenar,u,ucgeninCevresi,ucgeninAlani;
        System.out.print("1. kenarının uzunluğunu giriniz: ");
        akenar = inp.nextInt();

        System.out.print("2. kenarının uzunluğunu giriniz: ");
        bkenar = inp.nextInt();

        ckenar = Math.sqrt((akenar*akenar) + (bkenar*bkenar));

        System.out.println("Hipotenüs: "+ ckenar);

        u = (akenar + bkenar + ckenar)/2.0;
        ucgeninCevresi = u*2.0;
        ucgeninAlani = Math.sqrt(u * (u - akenar) * (u - bkenar) * (u - ckenar));

        System.out.print("Üçgenin Çevresi: " + ucgeninCevresi + "\nÜçgenin Alanı: " + ucgeninAlani);
    }
}