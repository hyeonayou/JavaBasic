package loop;

public class While1_3 {
    public static void main(String[] args) {

        int count = 0;

        count = count + 1;
        System.out.println("count = " + count);
        count += count;
        System.out.println("count = " + count);
        count += count;
        System.out.println("count = " + count);
    }
}
