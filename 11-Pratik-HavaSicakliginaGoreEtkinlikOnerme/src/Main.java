import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık Giriniz: ");
        heat = inp.nextInt();
        
        if(heat < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz");
            if (heat > 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else if (heat < 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}