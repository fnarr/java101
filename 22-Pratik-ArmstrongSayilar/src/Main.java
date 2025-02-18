public class Main {
    public static void main(String[] args) {
        int num, countNum = 0, tempNum, basNum, numPow, result = 0;

        for (int k = 1; k <= 999; k++){
            num = k;
            tempNum = num;
            while (tempNum != 0){
                tempNum /= 10;
                countNum++;
            }
            tempNum = num;
            while(tempNum != 0){
                basNum = tempNum % 10;
                numPow = 1;
                for (int i = 1; i <= countNum; i++){
                    numPow *= basNum;
                }
                result += numPow;
                tempNum /= 10;
            }
            if (result == num){
                System.out.println(num + " Sayısı Bir Armstrong Sayıdır.");
            } else {
                System.out.println(num + " Sayısı Bir Armstron Sayısı Değildir. Rakamların üslerinin toplamı: " + result);
            }
            countNum = 0;
            result = 0;
        }




    }
}