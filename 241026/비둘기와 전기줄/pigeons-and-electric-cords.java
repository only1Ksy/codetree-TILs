import java.util.*;

class Peacok{
    int num;
    int position;

    public Peacok (int num, int position){
        this.num = num;
        this.position = position;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] prePos = new int[11];
        Peacok[] p = new Peacok[n];
        Arrays.fill(prePos, -1);

        for (int i = 0; i < n; i++){
            int num = input.nextInt();
            int pos = input.nextInt();
            p[i] = new Peacok(num, pos);
        }

        int cnt = 0;

        for (int i = 0; i < n; i++){
            if (prePos[p[i].num] != p[i].position && prePos[p[i].num] != -1){
                cnt++;
            }
            prePos[p[i].num] = p[i].position;
        }

        System.out.println(cnt);
    }
}