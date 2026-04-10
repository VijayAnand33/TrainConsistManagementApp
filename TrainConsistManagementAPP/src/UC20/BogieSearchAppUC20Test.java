package UC20;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieSearchAppUC20Test {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};
        assertThrows(IllegalStateException.class, () -> {
            BogieSearchWithException.searchBogie(bogies, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101","BG205"};
        assertDoesNotThrow(() -> {
            BogieSearchWithException.searchBogie(bogies, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        assertTrue(BogieSearchWithException.searchBogie(bogies, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        assertFalse(BogieSearchWithException.searchBogie(bogies, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};
        assertTrue(BogieSearchWithException.searchBogie(bogies, "BG101"));
    }
}