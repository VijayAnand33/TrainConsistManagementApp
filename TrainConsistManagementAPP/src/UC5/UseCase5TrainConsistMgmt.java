package UC5;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * =====================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * =====================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Maintains insertion order while preventing duplicates
 * using LinkedHashSet.
 *
 * Author: YourName
 * Version: 5.0
 */

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================\n");

        // LinkedHashSet: maintains order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // ===== ADD BOGIES =====
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Intentional duplicate
        trainFormation.add("Sleeper");

        // ===== DISPLAY RESULT =====
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nUC5 completed successfully...");
    }
}