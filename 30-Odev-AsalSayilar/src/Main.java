public class Main {
    public static void main(String[] args) {
        int num = 100, asal;

        for (int i = 2; i <= num; i++){
            asal = 1;
            for (int j = 2; j * j <= i; j++){
                if (i % j == 0){
                    asal = 0;
                    break;
                }
            }
            if (asal == 1){
                System.out.print(i + " ");
            }
        }
    }
}