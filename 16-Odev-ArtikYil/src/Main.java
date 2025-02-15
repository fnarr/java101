import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();


        if (year % 400 == 0 && year % 100 == 0 && year > 0){
            System.out.println(year + " bir artık yıldır!");
        }else if(year % 4 ==0 && !(year % 100 ==0) && year>0 ){
            System.out.println(year + " bir artık yıldır!");
        }else
            System.out.println(year + " bir artık yıl değildir!");
    }
}