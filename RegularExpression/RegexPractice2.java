public class RegexPractice2 {
    public static void main(String[] args) {
        String regex = "A[bg]racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));


        String regex2 = "A([bg])racada\\1ra";
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));

    }
}
