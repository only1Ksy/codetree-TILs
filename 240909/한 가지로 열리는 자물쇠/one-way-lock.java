import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int cnt = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= n; k++){
                    int ami = Math.abs(i-a);
                    int bmi = Math.abs(j-b);
                    int cmi = Math.abs(k-c);

                    if (ami <= 2 || bmi <= 2 || cmi <=2)
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}