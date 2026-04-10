package UC7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * =====================================================
 *
 * Use Case 7: Sort Bogies by Capacity
 *
 * Author: YourName
 * Version: 7.0
 */

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================\n");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // ===== BEFORE SORT =====
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ===== SORT USING COMPARATOR =====
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // ===== AFTER SORT =====
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 completed successfully...");
    }
}
