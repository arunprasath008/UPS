package programs;

import java.util.Scanner;

public class TernarySearch {
    public static int ternarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }
            if (target < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, target);
            } else if (target > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, target);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements (must be sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        int result = ternarySearch(arr, 0, n - 1, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }
}