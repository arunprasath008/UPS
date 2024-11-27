package programs;

import java.util.Scanner;

public class some {
    private static void print2dArray(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] mat1= new int[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                mat1[r][c] = sc.nextInt();
            }
        }
        print2dArray(mat1);
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (c == r) {
                    mat1[r][c] = 0;
                }
            }
        }
        System.out.println("diagonal");
        print2dArray(mat1);
        System.out.println("one dimensional");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(mat1[r][c]);
            }
        }
            /*

        int o = sc.nextInt();
        int p = sc.nextInt();
        int[][] mat2=new int [o][p];
        for(int k=0;k<o;k++){
            for(int l=0;l<p;l++){
                mat2[k][l]=sc.nextInt();
            }
        }
        int[][] c = new int[n][p];
        if (n==o && m==p ) {
            System.out.println("multiply matrix");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("not possible");
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

         */
    }
}
