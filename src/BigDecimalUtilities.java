import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalUtilities {

    public static double roundToHundredth(BigDecimal input) {
        BigDecimal rounded = input
                .setScale(2, RoundingMode.HALF_UP);

        return rounded.doubleValue();
    }

    public static double reverseSign(BigDecimal input) {
        BigDecimal rounded =
                input
                .setScale(1, RoundingMode.HALF_UP)
                .negate();

        return rounded.doubleValue();
    }

}
