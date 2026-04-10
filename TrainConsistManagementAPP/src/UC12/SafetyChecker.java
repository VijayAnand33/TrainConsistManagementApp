package UC12;

import java.util.List;

public class SafetyChecker {

    public static boolean isSafe(List<GoodsBogie> bogies) {

        return bogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // other bogies allowed any cargo
        });
    }
}