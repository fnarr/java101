import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){
        int i = 0, j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--){
            reverse += str.charAt(i);
        }

        return str.toLowerCase().equals(reverse.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word;
        System.out.print("Denemek istediğiniz kelimeyi girin: ");
        word = inp.nextLine();

        System.out.println((isPalindrome2(word) ? "Girdiğiniz kelime palindrome." : "Girdiğiniz kelime palindrome değil."));
    }
}