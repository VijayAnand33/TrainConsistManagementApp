package UC13;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainAppTest {

    private List<PassengerBogie> getSampleData() {
        return Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC", 50),
                new PassengerBogie("General", 90),
                new PassengerBogie("Chair", 40)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<PassengerBogie> result = PerformanceChecker.filterWithLoop(getSampleData());
        assertEquals(2, result.size()); // only >60
    }

    @Test
    void testStreamFilteringLogic() {
        List<PassengerBogie> result = PerformanceChecker.filterWithStream(getSampleData());
        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<PassengerBogie> loop = PerformanceChecker.filterWithLoop(getSampleData());
        List<PassengerBogie> stream = PerformanceChecker.filterWithStream(getSampleData());
        assertEquals(loop.size(), stream.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long time = PerformanceChecker.measureLoopTime(getSampleData());
        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<PassengerBogie> bigList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bigList.add(new PassengerBogie("Sleeper", i % 100));
        }

        List<PassengerBogie> result = PerformanceChecker.filterWithStream(bigList);
        assertNotNull(result);
    }
}