package programs;


public class Box<T> {
    private T item;
    public void addItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }
}
class game {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();
        box.addItem(10);
        box.getItem();
    }

}
