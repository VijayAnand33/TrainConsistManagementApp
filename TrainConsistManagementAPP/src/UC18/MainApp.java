package UC18;

public class MainApp {
    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean result = SearchUtility.linearSearch(bogies, searchKey);

        if (result) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }
    }
}