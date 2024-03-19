public class Ex4 {
    private int[] nums = {13, 49, 90, 130, 175, 181, 255, 310, 330, 359};
    private int currentNumIndex = 0;

    public int next() {
        return nums[currentNumIndex++] / 90;
    }

    public static void main(String[] args) {
        Ex4 exercise4 = new Ex4();
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
    }
}
