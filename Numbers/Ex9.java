import java.text.DecimalFormat;

public class Ex9 {
    private static int addStringIntegers(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println(addStringIntegers("37", "13"));
    }
}
