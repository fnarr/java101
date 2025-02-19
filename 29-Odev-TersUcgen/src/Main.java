import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int step;

        System.out.print("Basamak sayısını girin: ");
        step = inp.nextInt();

        System.out.println();
        for (int i = 0; i < step; i++){
            for (int j = 0; j < ((2 * step -1) - (2 * i)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}