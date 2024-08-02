import java.util.*;

public class Main {
    public static void down(int n){
        if (n == 0)
            return;
        
        System.out.print(n + " ");

        down(n - 1);
    }
    public static void up(int n){
        if (n == 0)
            return;

        up(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        up(n);
        System.out.println();
        down(n);
    }
}