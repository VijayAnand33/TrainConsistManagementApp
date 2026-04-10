package UC11;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexValidator {

    // Train ID Pattern: TRN-1234
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";

    // Cargo Code Pattern: PET-AB
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    public static boolean validateTrainID(String trainId) {
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile(CARGO_CODE_REGEX);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }
}
