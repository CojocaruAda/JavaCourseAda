public class RegexPractice5 {
    public static void main(String[] args) {
        String email = "jerry.seinfeld@jokes.nbc.com";
        String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+";
        System.out.println(email.matches(regex));
    }
}
