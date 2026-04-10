package UC2;

import java.util.ArrayList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =====================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates dynamic management of passenger bogies
 * using ArrayList operations (CRUD).
 *
 * Functionality:
 * - Add bogies
 * - Remove bogie
 * - Check existence
 * - Display final consist
 *
 * Author: YourName
 * Version: 2.0
 */

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ===== CREATE (Add bogies) =====
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // ===== DELETE (Remove bogie) =====
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // ===== READ (Check existence) =====
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // ===== FINAL STATE =====
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}