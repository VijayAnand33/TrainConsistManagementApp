package UC19;

import java.util.Scanner;

public class BogieSearchApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter Bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean result = BogieSearch.binarySearch(bogies, key);

        if (result) {
            System.out.println("Bogie ID Found");
        } else {
            System.out.println("Bogie ID Not Found");
        }

        sc.close();
    }
}