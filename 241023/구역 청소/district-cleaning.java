import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int x2 = input.nextInt();
        
        int x3 = input.nextInt();
        int x4 = input.nextInt();

        int result = 0;

        // 1) 안 겹치는 경우
        if (x2 < x3 || x4 < x1)
            result = x2 - x1 + x4 - x3;
        // 2) 겹치는 경우
        else
            result = Math.max(x2, x4) - Math.min(x1, x3);
        
        System.out.println(result);
    }
}