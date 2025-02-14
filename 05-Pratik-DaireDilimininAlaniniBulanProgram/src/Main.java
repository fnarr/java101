import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r, a;
        double pi = 3.14,areaC;

        System.out.print("Dairenin yarı çapını girin: ");
        r = inp.nextInt();

        System.out.print("Daire diliminin merkez açısının ölçüsünü girin: ");
        a = inp.nextInt();

        areaC = (pi * (r * r) * a)/360;

        System.out.print("Daire diliminin alanı: " + areaC);
    }
}