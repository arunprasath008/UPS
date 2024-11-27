public interface anc {
    public default void run(){
    }
}
class bac implements anc{
    public void run(){
        System.out.println("nooo");
    }
}
class mny{
    public static void main(String[] args) {
        bac hii=new bac();
        hii.run();
    }
}

