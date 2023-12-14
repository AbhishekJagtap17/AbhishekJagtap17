package MultiThreading.NumberSystem;

public class NumberSystem {
    public static void main(String[] args) {
    //    NumberSystem ns = new NumberSystem();
        Order o = new Order();
        Reversed r = new Reversed();
    o.start();
    r.start();
    }
}