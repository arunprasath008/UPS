package programs;

public class rotate {
    public static void main(String[] args) {
        int [] arr = new int [] {12, 17, 19, 22, 28, 31, 35};
        int n = 3;

        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println();
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
