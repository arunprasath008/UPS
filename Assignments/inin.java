package programs;
import java.time.LocalDate;
import java.util.ArrayList;

interface Addable{
    int add(int a,int b);
}

class inin {
    public static void main(String args[])
    {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(20);
        arrL.add(14);
        arrL.add(5);
        arrL.forEach(n -> System.out.println(n));
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.print(n+" ");
        });
        System.out.println();
        arrL.stream()
                .filter(num -> num % 5 == 0)
                .forEach(System.out::print);
        System.out.println();
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                date);
    }
}