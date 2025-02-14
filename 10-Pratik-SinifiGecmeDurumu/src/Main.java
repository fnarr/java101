import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double mat, fizik, kimya, turkce, muzik, total=0, avarage;
        int count=0;

        System.out.print("Matematik notunuz: ");
        mat = inp.nextDouble();
        if(0 <= mat && mat <= 100){
            total += mat;
            count++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextDouble();
        if(0 <= fizik && fizik <= 100){
            total += fizik;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextDouble();
        if(0 <= kimya && kimya <= 100){
            total += kimya;
            count++;
        }

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextDouble();
        if(0 <= turkce && turkce <= 100){
            total += turkce;
            count++;
        }

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextDouble();
        if(0 <= muzik && muzik <= 100){
            total += muzik;
            count++;
        }

        if(count > 0){
            avarage = total/count;
            System.out.println("Ortalamanız: " + avarage);
            if (avarage < 55){
                System.out.println("Sınıfta Kaldınız.");
            }else {
                System.out.println("Sınıfı Geçtiniz.");
            }
        }else {
            System.out.println("Geçersiz not girdiniz");
        }


    }
}