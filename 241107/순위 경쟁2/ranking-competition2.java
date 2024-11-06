import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[] c = new char[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++){
            c[i] = input.next().charAt(0);
            s[i] = input.nextInt();
        }

        int a = 0, b = 0;
        int result = 2; // 멤버
                        // 0: a만 올라감
                        // 1: b만 올라감
                        // 2: 둘 다 올라감
        int cnt = 0;

        for (int i = 0; i < n; i++){
            if (c[i] == 'A'){
                a += s[i];
            }
            else{
                b += s[i];
            }

            int temp;

            if (a > b) temp = 0;
            else if (b > a) temp = 1;
            else temp = 2;

            if (temp != result){
                cnt++; result = temp;
            }
        }

        System.out.println(cnt);
    }
}