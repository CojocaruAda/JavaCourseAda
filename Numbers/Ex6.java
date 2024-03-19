import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex6 {
    public static String formatMoney(String money) {
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format(new BigDecimal(money));
    }

    public static void main(String[] args) {
        System.out.println(formatMoney("149.32"));
    }
}
