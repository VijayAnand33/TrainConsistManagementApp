package UC18;

class SearchUtility {

    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                return true; // found → stop early
            }
        }

        return false; // not found
    }
}