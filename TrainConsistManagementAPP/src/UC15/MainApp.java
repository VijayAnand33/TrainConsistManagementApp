package UC15;

public class MainApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");   // ✅ Safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");   // ❌ Unsafe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Grain");       // ✅ Safe

        System.out.println("Program continues after handling exception...");
    }
}