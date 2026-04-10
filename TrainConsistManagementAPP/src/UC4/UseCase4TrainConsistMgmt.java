package UC4;


import java.util.LinkedList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =====================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * Uses LinkedList to maintain physical sequence of train bogies.
 *
 * Author: YourName
 * Version: 4.0
 */

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ===== ADD INITIAL BOGIES =====
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ===== INSERT IN MIDDLE =====
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // ===== REMOVE FIRST & LAST =====
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // ===== FINAL STATE =====
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 completed successfully...");
    }
}