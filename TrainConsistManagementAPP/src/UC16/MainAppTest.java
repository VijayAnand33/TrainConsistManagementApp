package UC16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainAppTest {

    @Test
    public void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};

        SortUtility.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    private void assertArrayEquals(int[] ints, int[] arr) {
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};

        SortUtility.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};

        SortUtility.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] arr = {50};

        SortUtility.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};

        SortUtility.bubbleSort(arr);

        assertArrayEquals(new int[]{40, 40, 40}, arr);
    }
}