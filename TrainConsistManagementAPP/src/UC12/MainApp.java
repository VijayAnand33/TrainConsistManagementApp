package UC12;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean result = SafetyChecker.isSafe(bogies);

        if (result) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}
