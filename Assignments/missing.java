package programs;

public class missing {
    static int miss(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result ^= (i + 1) ^ arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        System.out.println(miss(arr));

    }
}
