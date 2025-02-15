import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, n3, top, mid, last;

        System.out.print("1. Sayıyı Girin: ");
        n1 = inp.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        n2 = inp.nextInt();

        System.out.print("3. Sayıyı Girin: ");
        n3 = inp.nextInt();

        if (n1 > n2 && n1 > n3){
            top = n1;
            if (n2 > n3){
                mid = n2;
                last = n3;
            } else {
                mid = n3;
                last = n2;
            }
        } else if (n2 > n1 && n2 > n3){
            top = n2;
            if (n1 > n3){
                mid = n1;
                last = n3;
            } else {
                mid = n3;
                last = n1;
            }
        } else {
            top = n3;
            if (n1 > n2){
                mid = n1;
                last = n2;
            }else {
                mid = n2;
                last = n1;
            }
        }

        System.out.println("En Büyük sayı: " + top);
        System.out.println("Ortanca Sayı: " + mid);
        System.out.println("En Küçük Sayı: " + last);
    }
}