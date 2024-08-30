import java.util.*;
class Distance {
    int x; int y;

    public Distance () {}

    public Distance (int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Distance [] dd = new Distance[n];
        
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            int y = input.nextInt();

            dd[i] = new Distance(x, y);
        }

        int min = INT_MAX;

        for (int i = 1; i < n-1; i++){
            int dis = 0;

            //i번째를 넘기고 가는 거리를 구하기
            for (int j = 0; j < n-1; j++){
                if (j == i-1){
                    dis += Math.abs(dd[j].x - dd[j+2].x) + Math.abs(dd[j].y - dd[j+2].y);
                }
                else if (j == i)
                    continue;
                else{
                    dis += Math.abs(dd[j].x - dd[j+1].x) + Math.abs(dd[j].y - dd[j+1].y);
                }
            }
            
            min = Math.min(min, dis);
        }

        System.out.println(min);
    }
}