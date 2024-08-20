import java.util.*;

class Info implements Comparable<Info>{
    int t = 0;
    int x = 0;
    int y = 0;

    public Info () {}

    public Info (int t, int x, int y){
        this.t = t;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Info info){
        return this.t - info.t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //감염 여부 확인용 배열 생성하기
        int n = input.nextInt();
        int [] pp = new int[n + 1];

        //감염시킨 횟수 확인용 배열 생성하기
        int k = input.nextInt();
        int [] kk = new int[n + 1];
        Arrays.fill(kk, k);

        //처음 감염자 감염 설정하기
        int p = input.nextInt();
        pp[p] = 1;

        //정보 객체 생성하기
        int T = input.nextInt();
        Info [] info = new Info[T];

        for (int i = 0; i < T; i++){
            int t = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            // t, x, y를 가진 객체 Info 생성하기
            info[i] = new Info(t, x, y);
        }

        //info 객체를 시간 순서대로 오름차순 정렬하기
        Arrays.sort(info);

        //감염자 파악하기 (1. 감염자인가? 2. 감염횟수가 남았는가?)
        for (int i = 0; i < T; i++){
            int a = info[i].x;
            int b = info[i].y;

            if (pp[a] == 1 && pp[b] == 1){
                kk[a] -= 1;
                kk[b] -= 1;
            }
            else if (pp[a] == 1 && kk[a] > 0){
                kk[a] -= 1;
                pp[b] = 1;
            }
            else if (pp[b] == 1 && kk[b] > 0){
                kk[b] -= 1;
                pp[a] = 1;
            }
        }

        //감염자 여부 출력하기
        for (int i = 1; i < n+1; i++){
            System.out.print(pp[i]);
        }
    }
}