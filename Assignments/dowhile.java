import java.util.*;
public class dowhile {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int number=a.nextInt();

        do {
            System.out.println( number);
            number++;
        } while (number <= 100);
    }
}
