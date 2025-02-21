import java.util.Scanner;

public class Main {

    static void pattern(int n, int tmpN, boolean wayControl)
    {
        if (n == tmpN)
        {
            System.out.print(n + " ");
            return;
        }
        if (n <= 0 || wayControl)
        {
            System.out.print(n + " ");
            wayControl = true;
            pattern(n += 5, tmpN, wayControl);
        }
        if (n > 0 && !wayControl)
        {
            System.out.print(n + " ");
            pattern(n -= 5, tmpN, wayControl);
        }
    }

    public static void main(String[] args) {
        int	number;
        boolean wayControl = false;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("N Sayısı: ");
            number = input.nextInt();
            if (number < 1)
                System.err.println("Girdiğiniz N sayisi 0'dan büyük olmalıdır !");
        }while(number < 1);
        System.out.print("Çıktısı: " + number + " ");
        pattern(number - 5, number, wayControl);
    }
}