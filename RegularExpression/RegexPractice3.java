public class RegexPractice3 {
    public static void main(String[] args) {
        String regex2 = "A(?:[bg])racada[bg]ra";
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));
    }
}
