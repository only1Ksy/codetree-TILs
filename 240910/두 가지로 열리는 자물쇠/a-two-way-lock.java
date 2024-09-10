import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] a = new int[2];
        int [] b = new int[2];
        int [] c = new int[2];

        a[0] = input.nextInt();
        b[0] = input.nextInt();
        c[0] = input.nextInt();

        a[1] = input.nextInt();
        b[1] = input.nextInt();
        c[1] = input.nextInt();

        int cnt = 0;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= n; k++){
                    for (int l = 0; l < 2; l++){
                        //원형 자물쇠이므로 1과 n이 인접해 있다는 사실도 고려해야 함
                        int aMi = Math.min(Math.abs(i - a[l]), n - Math.abs(i - a[l]));
                        int bMi = Math.min(Math.abs(j - b[l]), n - Math.abs(j - b[l]));
                        int cMi = Math.min(Math.abs(k - c[l]), n - Math.abs(k - c[l]));

                        if (aMi <= 2 && bMi <= 2 && cMi <= 2){
                            cnt++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}