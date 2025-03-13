import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++){
            int count = 0;
            boolean isRepeated = false;
            for(int j = 0; j < i; j++){
                if(list[i] == list[j]){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                for (int j = 0; j < list.length; j++){
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}