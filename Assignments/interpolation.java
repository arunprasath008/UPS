import java.util.Scanner;

public class interpolation {
    public static int interpolationSearch(int[] sortedArray, int toFind) {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        while (low <= high && toFind >= sortedArray[low] && toFind <= sortedArray[high]) {
            if (sortedArray[high] == sortedArray[low])
                return (low + high) / 2;

            mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);

            if (sortedArray[mid] < toFind)
                low = mid + 1;
            else if (sortedArray[mid] > toFind)
                high = mid - 1;
            else
                return mid;
        }
        return sortedArray[low] == toFind ? low : -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        int key = scan.nextInt();
        int result = interpolationSearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + result);
    }
}
