package UC11;

import java.util.regex.Pattern;

public class RegexValidator {

    private static final String TRAIN_REGEX = "TRN-\\d{4}";
    private static final String CARGO_REGEX = "PET-[A-Z]{2}";

    public static boolean validateTrainID(String trainId) {
        if (trainId == null || trainId.isEmpty()) return false;
        return Pattern.matches(TRAIN_REGEX, trainId);
    }

    public static boolean validateCargoCode(String cargoCode) {
        if (cargoCode == null || cargoCode.isEmpty()) return false;
        return Pattern.matches(CARGO_REGEX, cargoCode);
    }
}