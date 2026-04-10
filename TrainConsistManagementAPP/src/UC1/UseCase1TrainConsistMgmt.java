package UC1;

import java.util.ArrayList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * =====================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of the Train Consist Management Application.
 *
 * Functionality:
 * - Creates an empty train consist
 * - Uses dynamic list (ArrayList)
 * - Displays initial bogie count
 * - Prints current state of the train
 *
 * Author: YourName
 * Version: 1.0
 */

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize empty train consist (List)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Step 4: Display current state
        if (trainConsist.isEmpty()) {
            System.out.println("Train consist is currently empty.");
        } else {
            System.out.println("Train Consist: " + trainConsist);
        }

        // Step 5: Program continues...
        System.out.println("Application initialized successfully.");
    }
}
