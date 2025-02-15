import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km, age, travelType;
        double perKm = 0.10, price, discPrice, discAge, discTravelType;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz: ");
        travelType = inp.nextInt();
        System.out.println(" ");

        price = km * perKm;

        if((km > 0) && (age > 0)){
            if (age < 12){
                discAge = 0.5;
                discPrice = price - (price * discAge);
                price = discPrice;
                switch (travelType){
                    case 1:
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    case 2:
                        discTravelType = 0.2;
                        discPrice = price - (price * discTravelType);
                        price = discPrice * 2;
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz!");
                }
            } else if (age < 24) {
                discAge = 0.1;
                discPrice = price - (price * discAge);
                price = discPrice;
                switch (travelType){
                    case 1:
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    case 2:
                        discTravelType = 0.2;
                        discPrice = price - (price * discTravelType);
                        price = discPrice * 2;
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz!");
                }
            } else if (age > 24 && age < 65) {
                switch (travelType){
                    case 1:
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    case 2:
                        discTravelType = 0.2;
                        discPrice = price - (price * discTravelType);
                        price = discPrice * 2;
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz!");
                }
            } else if (age > 65 && age <= 130) {
                discAge = 0.3;
                discPrice = price - (price * discAge);
                price = discPrice;
                switch (travelType){
                    case 1:
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    case 2:
                        discTravelType = 0.2;
                        discPrice = price - (price * discTravelType);
                        price = discPrice * 2;
                        System.out.print("Toplam Tutar = " + price + " TL");
                        break;
                    default:
                        System.out.println("Hatalı Veri Girdiniz!");
                }
            } else {
                System.out.println("Hatalı Veri Girdiniz!");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }


    }
}