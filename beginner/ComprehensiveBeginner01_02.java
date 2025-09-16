import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args ) {
        Random rand = new Random();
       int[] arr = new int [10];
       int sum = 0;

         for ( int i = 0; i <= 9; i++) {
            int ran =  rand.nextInt(100) + 1;
            arr[i] = ran;
            sum += ran;
            System.out.println("合計値 : " + sum);
            System.out.println("入力された数値" +arr[i]);

            if ( sum > 100) {
                break;
            }
         }
    }
}