package programs;

public class bbox<T> {
    T item;
    public void add(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }

    public static void main(String[] args) {
        bbox<Integer> lol=new bbox<>();
        bbox<String>  olo=new bbox<>();
        lol.add(23323);
        olo.add("thre");
        System.out.println("olo contains: " + olo.get());
        System.out.println("lol contains: " + lol.get());

    }
}

