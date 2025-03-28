import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,2,1,33,9,1,4,5,4,10,9,21,22,32,34,22,33,3};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value: duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}