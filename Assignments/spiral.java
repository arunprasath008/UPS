package programs;

public class spiral {
    public static void spiralmat(int m, int n, int [][]a){
        int t = 0, b = m - 1, l = 0, r = n - 1;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; ++i) {
                System.out.print(a[t][i] + " ");
            }
            t++;
            for (int i = t; i <= b; ++i) {
                System.out.print(a[i][r] + " ");
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; --i) {
                    System.out.print(a[b][i] + " ");
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        spiralmat(4,4,matrix);

    }
}
