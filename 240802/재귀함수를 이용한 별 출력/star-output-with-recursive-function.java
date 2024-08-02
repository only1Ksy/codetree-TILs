import java.util.*;

public class Main {
    public static void makingStar(int n){
        if (n == 0)
            return;
        
        makingStar(n - 1);

        for (int i = 0; i < n; i++)
            System.out.print("*");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        makingStar(n);
    }
}