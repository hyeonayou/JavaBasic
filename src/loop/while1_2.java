package loop;

public class while1_2 {
    public static void main(String[] args) {
        int count = 0;

        int sum = 0;

        while (count<4) {
           sum += count++;

            System.out.println("count = " + count);
        }
        System.out.println("sum = " + sum);
    }
}
