import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        int count = 1;

        System.out.print("Sınır sayısını girin: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4){
            System.out.println("4^" + count + ": " + i);
            count++;
        }
        count = 1;
        System.out.println();
        for (int j = 1; j <= n; j *= 5){
            System.out.println("5^" + count + ": " + j);
            count++;
        }
    }
}