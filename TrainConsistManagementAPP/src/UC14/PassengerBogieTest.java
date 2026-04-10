package UC14;

import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerBogieTest {

    @Test
    public void testException_ValidCapacityCreation() throws Exception {
        PassengerBogie bogie = new PassengerBogie("AC", 50);
        assertEquals("AC", bogie.getType());
        assertEquals(50, bogie.getCapacity());
    }

    @Test(expected = InvalidCapacityException.class)
    public void testException_NegativeCapacityThrowsException() throws Exception {
        new PassengerBogie("Sleeper", -10);
    }

    @Test(expected = InvalidCapacityException.class)
    public void testException_ZeroCapacityThrowsException() throws Exception {
        new PassengerBogie("Sleeper", 0);
    }

    @Test
    public void testException_ExceptionMessageValidation() {
        try {
            new PassengerBogie("AC", -5);
            fail("Exception not thrown");
        } catch (InvalidCapacityException e) {
            assertEquals("Capacity must be greater than zero", e.getMessage());
        }
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws Exception {
        PassengerBogie bogie = new PassengerBogie("FirstClass", 30);
        assertEquals("FirstClass", bogie.getType());
        assertEquals(30, bogie.getCapacity());
    }

    @Test
    public void testException_MultipleValidBogiesCreation() throws Exception {
        PassengerBogie b1 = new PassengerBogie("AC", 40);
        PassengerBogie b2 = new PassengerBogie("Sleeper", 60);

        assertEquals(40, b1.getCapacity());
        assertEquals(60, b2.getCapacity());
    }
}