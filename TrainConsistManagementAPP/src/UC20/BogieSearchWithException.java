package UC20;

import java.util.Arrays;

public class BogieSearchWithException {

    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available to search.");
        }

        // Sort before binary search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIds[mid]);

            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
