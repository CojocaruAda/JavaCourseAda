import java.text.DecimalFormat;

public class Ex8 {
    public static void main(String[] args) {
        System.out.printf("$%,.2f%n", 123456.783);
        System.out.printf("%,(.3f%n", -9876.32532);
        System.out.printf("%ef%n", 23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf("%,+.1f%n", -9876.35532);

        System.out.println("-------------------------------");

        String v1 = String.format("$%,.2f%n", 123456.783);
        String v2 = String.format("%,(.3f%n", -9876.32532);
        String v3 = String.format("%ef%n", 23.19283928394829182);
        String v4 = String.format("%010d%n", 123456);
        String v5 = String.format("%,+.1f%n", -9876.35532);

        System.out.print(v1);
        System.out.print(v2);
        System.out.print(v3);
        System.out.print(v4);
        System.out.print(v5);

        System.out.println("-------------------------------");

        System.out.println(new DecimalFormat("$,###.##").format(123456.783)); // you could also do "$#,###.##"
        System.out.println(new DecimalFormat(",###.###;(#)").format(-9876.32532));
        System.out.println(new DecimalFormat("0.######E00f").format( 23.19283928394829182)); // not possible to get the plus sign in "...e+01f" with format string
        System.out.println(new DecimalFormat("0000000000").format(123456));
        System.out.println(new DecimalFormat(",###.#;-").format(-9876.35532));
    }
}
