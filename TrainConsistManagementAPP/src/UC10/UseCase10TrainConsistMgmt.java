package UC10;

import java.util.ArrayList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * =====================================================
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Author: YourName
 * Version: 10.0
 */

public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // ===== DISPLAY =====
        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // ===== AGGREGATION USING STREAM =====
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)   // extract capacity
                .reduce(0, Integer::sum); // sum all values

        // ===== RESULT =====
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 completed successfully...");
    }
}
