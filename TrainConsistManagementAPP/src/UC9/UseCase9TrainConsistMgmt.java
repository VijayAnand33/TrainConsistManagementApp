package UC9;

import java.util.*;
import java.util.stream.Collectors;

/*
 * =====================================================
 * MAIN CLASS - UseCase9TrainConsistMgmt
 * =====================================================
 *
 * Use Case 9: Group Bogies by Type
 *
 * Author: YourName
 * Version: 9.0
 */

public class UseCase9TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=====================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // ===== DISPLAY ALL =====
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        // ===== GROUPING =====
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        // ===== DISPLAY GROUPED RESULT =====
        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}