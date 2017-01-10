import java.util.Arrays;

/**
 * Created by dan on 1/9/17.
 */
public class ArrayExercises {

    public static int indexOfMax(int[] numbers) {
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean[] sieve(int n){

        //assume all ints are primes
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i <= n; i++){
            isPrime[i] = true;
        }
       // Arrays.toString(isPrime);

        //mark non primes <= n
        for(int factor = 2; factor * factor <= n; factor++){
            //if factor is prime, mark multiples of factor as non-prime
            if(isPrime[factor]) {
                for(int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        return isPrime;
    }

    public static boolean areFactors(int[] factors, int n) {

        for(int factor : factors) {
            if (n % factor != 0) return false;
        }

        return true;
    }

    public static void main(String[] args){
        int[] testing = new int[] {17, 5, 3, 16};
        int[] testing2 = new int[] {3, 5, 5, 5};
        int[] testing3 = new int[] {-5, -3, -2};
        int[] testing4 = new int[] {0, 0, 0, 0 , 0};

        System.out.println(indexOfMax(testing));
        System.out.println(indexOfMax(testing2));
        System.out.println(indexOfMax(testing3));
        System.out.println(indexOfMax(testing4));
        System.out.println(Arrays.toString(sieve(10)));

        int[] factorstest1 = new int[] {1, 2, 5, 10};
        int[] factorstest2 = new int[] {1, 3, 5, 9};

        System.out.println(areFactors(factorstest1, 10));
        System.out.println(areFactors(factorstest2, 9));
    }
}
