import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num, numControl = 0;
        boolean control = true;
        System.out.println("Programdan çıkmak için 0 yazın.");

        while (control){
            System.out.print("Bir sayı giriniz: ");
            num = inp.nextInt();

            if (num == 0){
                // burda sadece control false eşitlersek 0' ıda kontrol edicekti hiç kontrol ettirmeden direkt çıkması için break yazıyoruz.
                // control = false;
                break;
            }
            for (int i = 1; i < num; i++){
                if (num % i == 0){
                    numControl += i;
                }
            }
            if (num == numControl){
                System.out.println(num + " Mükemmel sayıdır.");
            } else {
                System.out.println(num + " Mükemmel sayı değildir.");
            }
            numControl = 0;
        }

    }
}