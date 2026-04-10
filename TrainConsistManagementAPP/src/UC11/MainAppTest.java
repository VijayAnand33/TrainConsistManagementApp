package UC11;

class RegexValidatorTest {

    public static void main(String[] args) {

        // ✅ Valid Train ID
        System.out.println("Valid Train ID:");
        System.out.println(RegexValidator.validateTrainID("TRN-1234"));

        // ❌ Invalid Train ID
        System.out.println("Invalid Train ID:");
        System.out.println(RegexValidator.validateTrainID("TRAIN12"));
        System.out.println(RegexValidator.validateTrainID("TRN12A"));
        System.out.println(RegexValidator.validateTrainID("1234-TRN"));

        // ✅ Valid Cargo Code
        System.out.println("Valid Cargo Code:");
        System.out.println(RegexValidator.validateCargoCode("PET-AB"));

        // ❌ Invalid Cargo Code
        System.out.println("Invalid Cargo Code:");
        System.out.println(RegexValidator.validateCargoCode("PET-ab"));
        System.out.println(RegexValidator.validateCargoCode("PET123"));
        System.out.println(RegexValidator.validateCargoCode("AB-PET"));

        // ❌ Digit length check
        System.out.println("Digit Length Check:");
        System.out.println(RegexValidator.validateTrainID("TRN-123"));
        System.out.println(RegexValidator.validateTrainID("TRN-12345"));

        // ❌ Uppercase check
        System.out.println("Uppercase Check:");
        System.out.println(RegexValidator.validateCargoCode("PET-ab"));

        // ❌ Empty input
        System.out.println("Empty Input:");
        System.out.println(RegexValidator.validateTrainID(""));
        System.out.println(RegexValidator.validateCargoCode(""));

        // ❌ Exact match check
        System.out.println("Exact Match:");
        System.out.println(RegexValidator.validateTrainID("TRN-1234XYZ"));
        System.out.println(RegexValidator.validateCargoCode("PET-AB123"));
    }
}