package programs;

public class recursive {
    public static int getsum (int n){
        int total = 0;
        while (n != 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }
    public static int gcd(int a,int b){
        if (b==0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a=2345;
        System.out.println(getsum(a));
        int m=12;
        int n=24;
        System.out.println(gcd(m,n));
    }

}
