import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int x4 = input.nextInt();

        boolean isCross = true;

        if (x2 < x3 || x4 < x1)
            isCross = false;

        System.out.println(isCross ? "intersecting" : "nonintersecting");
    }
}