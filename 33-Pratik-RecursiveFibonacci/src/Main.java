public class Main {

    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Girilen değer: " + num);
        System.out.println(fib(num));
    }
}