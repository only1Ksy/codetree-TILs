import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int a2 = input.nextInt();
        int b2 = input.nextInt();

        int result = (Math.max(y2, b2) - Math.min(y1, b1)) *
                     (Math.max(x2, a2) - Math.min(x1, a1));

        System.out.println(result);
    }
}