import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("Kilonuzu girin: ");
        weight = inp.nextDouble();

        System.out.print("Boyunuzu girin: ");
        height = inp.nextDouble();

        bmi = weight / (height * height);

        System.out.print("Vücut Kitle Endeksiniz: " + bmi);
    }
}