import java.util.Arrays;
import java.util.Random;

public class al {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] aar = new int[10];

        for (int i = 0; i < 10; i++) {
            aar[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(aar));
        System.out.println(Arrays.toString(prime(aar)));
    }

    public static boolean[] prime(int[] arr) {
        boolean[] result = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = isPrime(arr[i]);
        }

        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }
}
