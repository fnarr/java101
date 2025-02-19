import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, ebob = 1, ekok = 1;

        System.out.print("n1 sayısını girin: ");
        n1 = inp.nextInt();

        System.out.print("n2 sayısını girin: ");
        n2 = inp.nextInt();

/*
        n2 girilirken küçük girilirse işe yarayacak while döngüsü
        int k = n2;
        while (k >= 1){
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break;
            }
            k--;
        }
*/

        if (n1 > n2){
            for (int i = n2; i >= 1; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }
            }
            System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u: " + ebob);

            for (int j = 1; j <= (n1 * n2); j++){
                if (j %  n1 == 0 && j % n2 == 0){
                    ekok = j;
                    break;
                }
            }
            System.out.print(n1 + " ve " + n2 + " sayısının EKOK'u: " + ekok);
        } else {
            for (int i = n1; i >= 1; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }
            }
            System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u: " + ebob);

            for (int j = 1; j <= (n1 * n2); j++){
                if (j %  n1 == 0 && j % n2 == 0){
                    ekok = j;
                    break;
                }
            }
            System.out.print(n1 + " ve " + n2 + " sayısının EKOK'u: " + ekok);
        }
    }
}