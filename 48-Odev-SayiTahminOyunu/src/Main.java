import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);

        int number = rand.nextInt(100);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5){
            System.out.println("-----------------------------");
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğin sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Girdiğiniz tahmin doğru değil!");
                if (selected > number){
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }

        if (!isWin){
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli Sayı: " + number);
            if (!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }

    }
}