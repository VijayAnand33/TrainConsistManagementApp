package UC19;

import java.util.Arrays;

public class BogieSearch {

    // Method to perform Binary Search
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Sort the array (important precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIds[mid]);

            if (compare == 0) {
                return true; // Found
            } else if (compare < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }
}