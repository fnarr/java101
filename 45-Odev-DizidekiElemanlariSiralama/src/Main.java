import java.util.*;
public class Main {

    static void arrSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu \"n\": ");
        int n = inp.nextInt();

        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < list.length; i++){
            System.out.print((i+1) + ". Elemanı: ");
            list[i] = inp.nextInt();
        }
        arrSort(list);
        System.out.print("Sıralama: ");
        for(int j: list){
            System.out.print(j + " ");
        }
    }
}