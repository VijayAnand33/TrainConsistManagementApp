package UC3;

import java.util.HashSet;
import java.util.Set;

/*
 * =====================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =====================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Ensures duplicate bogie IDs are NOT added using HashSet.
 *
 * Author: YourName
 * Version: 3.0
 */

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // Create HashSet (no duplicates allowed)
        Set<String> bogieIds = new HashSet<>();

        // ===== ADD IDs (including duplicates) =====
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        // Intentional duplicates
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        // ===== DISPLAY RESULT =====
        System.out.println("Final Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 completed successfully...");
    }
}
