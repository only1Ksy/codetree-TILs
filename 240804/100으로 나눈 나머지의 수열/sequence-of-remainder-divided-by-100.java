import java.util.*;

public class Main {
    public static int printN(int n){
        if (n == 1)
            return 2;
        if (n == 2)
            return 4;

        return (printN(n-1)*printN(n-2))%100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(printN(n));
    }
}

//A1 = 2, A2 = 4
//An = A(n-2)*A(n-2)%100