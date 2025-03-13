import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi: "  + Arrays.toString(arr));
        System.out.print("Girilen Sayı: ");
        int value = inp.nextInt();
        int valueMin = Integer.MAX_VALUE;
        int valueMax = Integer.MIN_VALUE;

        boolean isNearMin = false;
        boolean isNearMax = false;

        for(int i: arr){
            if(i < value){
                if(!isNearMin || (value - i) < (value - valueMin)){
                    valueMin = i;
                    isNearMin = true;
                }
            }
            if(i > value){
                if (!isNearMax || (i - value) < (valueMax - value)){
                    valueMax = i;
                    isNearMax = true;
                }
            }
        }

        if(isNearMin){
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + valueMin);
        }else {
            System.out.println("Girilen sayıdan küçük bir değer bulunamadı.");
        }

        if (isNearMax){
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + valueMax);
        } else {
            System.out.println("Girilen sayıdan büyük bir değer bulunamadı.");
        }
    }
}