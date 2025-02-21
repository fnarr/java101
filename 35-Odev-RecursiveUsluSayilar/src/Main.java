import java.util.Scanner;

public class Main {

    static int power( int base, int exponent){
        int result;
        if (exponent == 1) return base;
        else if (exponent == 0) return 1;
        result = base * power(base, exponent-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int n = inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int m= inp.nextInt();
        System.out.println("Sonuç: " + power(n,m));
    }
}