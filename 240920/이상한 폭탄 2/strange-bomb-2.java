import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int [] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        int max = -1;

        for (int i = 0; i < Math.max(n-k, 1); i++){
            ArrayList <Integer> arr = new ArrayList<>();

            for (int j = i; j <= i + k; j++){
                if (arr.contains(a[j])){
                    max = Math.max(max, a[j]);
                }
                arr.add(a[j]);
            }
        }

        System.out.println(max);
    }
}