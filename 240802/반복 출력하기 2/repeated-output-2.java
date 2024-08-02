import java.util.*;

public class Main {
    public static void helloWorld(int n){
        if (n == 0)
            return;
        
        helloWorld(n-1);

        System.out.println("HelloWorld");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        helloWorld(n);
    }
}