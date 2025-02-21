import java.util.Scanner;

public class Main {

    static	boolean	isPrime(int num, int tmpNum)
    {
        if (num % tmpNum == 0 && num != 2)
            return (false);
        if (tmpNum > 2)
            return(isPrime(num, tmpNum -= 1));
        else
            return(true);
    }

    public static void main(String[] args) {
        int	num, tmpNum;
        boolean checkPrime;
        Scanner inp = new Scanner(System.in);
        do
        {
            System.out.print("Sayı Giriniz : ");
            num = inp.nextInt();
            if (num < 0)
                System.err.println("0' dan küçük sayı girmeyin!");
        }while(num < 0);
        if (num == 0 || num == 1)
        {
            System.out.println(num + " sayısı ASAL değildir !");
            return ;
        }
        tmpNum = num -1;
        checkPrime = isPrime(num, tmpNum);
        if (checkPrime)
            System.out.println(num + " sayısı ASALDIR !");
        else
            System.out.println(num + " sayısı ASAL değildir !");
    }
}