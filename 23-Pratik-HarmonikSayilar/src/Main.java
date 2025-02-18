import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        double result = 0;

        System.out.print("N sayısını girin: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            result += 1.0 / i;
        }
        System.out.println(result);
    }
}