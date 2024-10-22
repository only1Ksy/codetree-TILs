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

        boolean isCross = true;

        if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1)
            isCross = false;

        System.out.println(isCross ? "overlapping" : "nonoverlapping");
    }
}