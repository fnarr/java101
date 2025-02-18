import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, total = 0;

        do {
            System.out.print("Bir sayı girin: ");
            n = inp.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Toplam: " + total);
    }
}