public class poly {
    public void triangle(){
        System.out.println("tra");
    }
}
class puny extends poly{
    public void triangle(){
        System.out.println("rectii");
    }
}
class mony {
    public static void main(String[] args) {
       poly puy=new poly();
       poly poy=new puny();
       poy.triangle();
       puy.triangle();
    }
}
