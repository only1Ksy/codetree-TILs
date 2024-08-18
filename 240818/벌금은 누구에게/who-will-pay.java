import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int [] howMany = new int[n + 1];

        int num = -1;

        for (int i = 0; i < m; i++){
            int stuNum = input.nextInt();

            howMany[stuNum] += 1;

            if (howMany[stuNum] == k){
                num = stuNum;
                break;
            }
        }

        System.out.println(num);
    }
}