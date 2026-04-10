package UC6;

import java.util.HashMap;
import java.util.Map;

/*
 * =====================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * =====================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * Associates each bogie with its seating/load capacity
 * using HashMap (key-value structure).
 *
 * Author: YourName
 * Version: 6.0
 */

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=====================================\n");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ===== INSERT DATA =====
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);

        // ===== DISPLAY DATA =====
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(
                    "Bogie: " + entry.getKey() +
                            " | Capacity: " + entry.getValue()
            );
        }

        System.out.println("\nUC6 completed successfully...");
    }
}