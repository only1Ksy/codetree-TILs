import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        int nx = 0;
        int ny = 0;

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            String s = input.next();
            int l = input.nextInt();

            if (s.equals("E")){
                nx += l * dx[0];
                ny += l * dy[0];
            }
            else if (s.equals("S")){
                nx += l * dx[1];
                ny += l * dy[1];
            }
            else if (s.equals("W")){
                nx += l * dx[2];
                ny += l * dy[2];
            }
            else if (s.equals("N")){
                nx += l * dx[3];
                ny += l * dy[3];
            }
        }

        System.out.println(nx + " " + ny);
    }
}