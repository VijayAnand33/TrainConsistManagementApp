package UC11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainAppTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(RegexValidator.validateTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(RegexValidator.validateTrainID("TRAIN12"));
        assertFalse(RegexValidator.validateTrainID("TRN12A"));
        assertFalse(RegexValidator.validateTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(RegexValidator.validateCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(RegexValidator.validateCargoCode("PET-ab"));
        assertFalse(RegexValidator.validateCargoCode("PET123"));
        assertFalse(RegexValidator.validateCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(RegexValidator.validateTrainID("TRN-123"));
        assertFalse(RegexValidator.validateTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(RegexValidator.validateCargoCode("PET-ab"));
        assertFalse(RegexValidator.validateCargoCode("PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(RegexValidator.validateTrainID(""));
        assertFalse(RegexValidator.validateCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(RegexValidator.validateTrainID("TRN-1234XYZ"));
        assertFalse(RegexValidator.validateCargoCode("PET-AB123"));
    }
}