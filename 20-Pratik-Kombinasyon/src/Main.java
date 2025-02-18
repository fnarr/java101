import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,r,totalN=1,totalR=1,totalNr=1,c;

        System.out.print("C(n,r)=> n'yi gir: ");
        n = inp.nextInt();

        System.out.print("C(n,r)=> r'yi gir: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++){
            totalN *= i;
        }
        for (int j = 1; j <= r; j++){
            totalR *= j;
        }
        for (int k = 1; k <= (n-r); k++){
            totalNr *= k;
        }
        c = totalN / (totalR * totalNr);

        System.out.print("C(" + n + "," + r + "): " + c);
    }
}