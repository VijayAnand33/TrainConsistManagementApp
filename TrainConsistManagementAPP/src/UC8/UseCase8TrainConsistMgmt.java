package UC8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * =====================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * =====================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Author: YourName
 * Version: 8.0
 */

public class UseCase8TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=====================================\n");

        // Create list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // ===== FILTER USING STREAM =====
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // ===== DISPLAY RESULT =====
        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nUC8 completed successfully...");
    }
}