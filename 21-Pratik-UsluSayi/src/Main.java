import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,k, total = 1;

        System.out.print("Üssü alınacak sayıyı girin: ");
        n = inp.nextInt();

        System.out.print("Üssü girin:");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(n + "^" + k + ": " + total);
    }
}