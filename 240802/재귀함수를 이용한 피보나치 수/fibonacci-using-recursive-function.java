import java.util.*;

public class Main {
    public static int phibo(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        return phibo(n - 1) + phibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(phibo(n));
    }
}

// A1 = 1, A2 = 1 => 종료 조건에 대한 힌트
// An = A(n-1) + A(n-2) => 점화식에 대한 힌트