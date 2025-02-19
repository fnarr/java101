import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int count;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = inp.nextInt();

        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = inp.nextInt();

            if (num > numMax){
                numMax = num;
            }

            if (num < numMin){
                numMin = num;
            }
        }

        System.out.println("En büyük sayı: " + numMax);
        System.out.println("En küçük sayı: " + numMin);
    }
}