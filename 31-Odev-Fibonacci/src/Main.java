import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, term1 = 0, term2 = 1, nextTerm;

        System.out.print("Terim sayısı: ");
        n = inp.nextInt();

        System.out.print(n + " Elemanlı Fibonacci Serisi : ");

        for (int i = 1; i <= n; i++){
            System.out.print(term1 + " ");
            nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
    }
}