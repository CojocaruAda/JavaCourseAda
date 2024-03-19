import java.util.Random;

public class Ex5 {
    private int sum = 0;

    public int next() {
        this.sum += new Random().nextInt(10);
        return this.sum;
    }

    public static void main(String[] args) {
        Ex5 exercise5 = new Ex5();
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
    }
}
