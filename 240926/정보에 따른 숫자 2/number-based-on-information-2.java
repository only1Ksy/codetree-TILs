import java.util.*;

class Alpha implements Comparable<Alpha>{
    char c;
    int x;

    public Alpha (){}

    public Alpha(char c, int x){
        this.c = c;
        this.x = x;
    }

    public int compareTo(Alpha alpha){
        return this.x - alpha.x;
        // == (오름차순 정렬)
    }
}

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        Alpha[] al = new Alpha[t];

        int a = input.nextInt();
        int b = input.nextInt();

        int max = 0;
        int min = INT_MAX;

        for (int i = 0; i < t; i++){
            char c = input.next().charAt(0);
            int x = input.nextInt();

            al[i] = new Alpha(c, x);
        }

        Arrays.sort(al); // 굳이 sort 할 필요도 없넹

        int cnt = 0;

        for (int i = a; i <= b; i++){
            // i부터 al[j] (s인 경우, n인 경우) 위치 구하기
            int sPlace = INT_MAX;
            int nPlace = INT_MAX;

            for (int j = 0; j < t; j++) {
                if (al[j].c == 'S') {
                    sPlace = Math.min(sPlace, Math.abs(al[j].x - i));
                } else if (al[j].c == 'N') {
                    nPlace = Math.min(nPlace, Math.abs(al[j].x - i));
                }
            }

            if (sPlace <= nPlace) cnt++;
        }

        System.out.println(cnt);
    }
}