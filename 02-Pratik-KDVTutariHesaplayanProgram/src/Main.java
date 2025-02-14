import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar, kdvTutar,kdvOran, kdvliTutar;

        System.out.print("Ücret tutarını girin: ");
        tutar = inp.nextDouble();

        kdvOran = ((0 < tutar) && (tutar < 1000))?0.18:0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}