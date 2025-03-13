public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double sum = 0;
        for(int i: arr){
            sum += 1.0 / i;
        }
        double avHarm = arr.length / sum;
        System.out.println("Dizinin Harmonik Ortalaması: " + avHarm);
    }
}