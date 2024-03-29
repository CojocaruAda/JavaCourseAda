public class Ex3 {
    private String[] people = {"bob", "larry", "sammy", "johnny", "rohith", "sally", "susan", "betty", "jane", "samantha"};
    private int currentPersonIndex = 0;

    public String next() {
        String person = people[currentPersonIndex++];
        return person.substring(0,1).toUpperCase() + person.substring(1);
    }

    public static void main(String[] args) {
        Ex3 exercise3 = new Ex3();
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
        System.out.println(exercise3.next());
    }
}
