package UC13;
import java.util.*;
import java.util.stream.Collectors;

public class PerformanceChecker {

    // 🔁 Loop-based filtering
    public static List<PassengerBogie> filterWithLoop(List<PassengerBogie> list) {
        List<PassengerBogie> result = new ArrayList<>();

        for (PassengerBogie b : list) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // 🌊 Stream-based filtering
    public static List<PassengerBogie> filterWithStream(List<PassengerBogie> list) {
        return list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // ⏱ Loop timing
    public static long measureLoopTime(List<PassengerBogie> list) {
        long start = System.nanoTime();
        filterWithLoop(list);
        long end = System.nanoTime();
        return end - start;
    }

    // ⏱ Stream timing
    public static long measureStreamTime(List<PassengerBogie> list) {
        long start = System.nanoTime();
        filterWithStream(list);
        long end = System.nanoTime();
        return end - start;
    }
}