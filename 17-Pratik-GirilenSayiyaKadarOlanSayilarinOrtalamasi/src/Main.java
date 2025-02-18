import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num;
        double total = 0;
        int n = 0;

        System.out.print("Bir sayı girin: ");
        num = inp.nextInt();

        for (int i = 0; i < num; i++){
            if (i % 3 == 0 && i % 4 == 0){
                n++;
                total += i;
            }
        }

        total = total / n;

        System.out.print("Ortalama: " + total);
    }
}