import java.util.*;

public class Main {
    public static int getNum(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        return getNum(n/3) + getNum(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(getNum(n));
    }
}