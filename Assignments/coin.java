    package programs;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;

    public class coin {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] coins=new int[m];
            for(int i=0;i<m;i++){
                coins[i]=sc.nextInt();
            }
            int count=0;
            int sum=0;
            ArrayList<Integer> denom=new ArrayList<>();
            Arrays.sort(coins);
            int i = coins.length-1;
            while(sum<n){
                if(!denom.contains(coins[i])){
                    if(sum+coins[i]<=n){
                        sum+=coins[i];
                        count++;
                    }
                    else{
                        denom.add(coins[i]);
                        if(i-1==-1){
                            System.out.println("NOT POSSIBLE");
                            break;
                        }else {
                            i--;
                        }
                    }
                }
            }
            if(sum==n && count>1){
                System.out.println(count);
            }
        }
    }
