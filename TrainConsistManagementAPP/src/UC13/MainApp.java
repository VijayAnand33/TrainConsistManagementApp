package UC13;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<PassengerBogie> list = new ArrayList<>();

        list.add(new PassengerBogie("Sleeper", 72));
        list.add(new PassengerBogie("AC", 50));
        list.add(new PassengerBogie("General", 90));
        list.add(new PassengerBogie("Chair", 40));

        long loopTime = PerformanceChecker.measureLoopTime(list);
        long streamTime = PerformanceChecker.measureStreamTime(list);

        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");
    }
}
