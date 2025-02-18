import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;

        System.out.print("Elmasın yıldız basamağını girin: ");
        n = inp.nextInt();
        for (int i = 1; i < n; i++){
            for (int k = 1; k <= (n - i); k++){
                    System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}