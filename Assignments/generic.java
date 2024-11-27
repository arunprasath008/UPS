package programs;

public class generic<T> {
     T data;
     public static  <T> boolean equall(T[] arr, T[] brr){
         if(arr.length!=brr.length){
             return false;
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]!=brr[i]){
                 return false;
             }
         }
         return true;
     }
    static class sum {
        public int odd;
        public int even;

        public sum(int oddSum, int evenSum) {
            this.odd = oddSum;
            this.even = evenSum;
        }
        public String toString() {
            return   odd + "," + even;
        }
    }
    public static  <T extends Number> sum summ(T[]arr){
         int odd=0;
         int even=0;
         for(int i=0;i<arr.length;i++){
             int val=arr[i].intValue();
             if(val%2==0){
                 even+=val;
             }else{
             odd+=val;}
         }
         return new sum(odd,even);
     }


    public static void main(String[] args) {
        Integer[] array={1,2,3,4};
        Integer[] array1={1,2,3,5};
        String [] arr={"h","e","l"};
        String [] brr={"h","e","l"};
        System.out.println(equall(arr,brr));

        System.out.println(equall(array,array1));
        System.out.println(summ(array1));
    }



}

