import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // 0 : A score, 1: B score, 2: C score
        int[] score = new int[3];
        int[] board = new int[3];
        Arrays.fill(board, 1);
        int cnt = 0;

        for (int i = 0; i < n; i++){
            char c = input.next().charAt(0);
            int s = input.nextInt();

            if (c == 'A'){
                score[0] += s;
            } else if (c == 'B'){
                score[1] += s;
            } else {
                score[2] += s;
            }

            int maxScore = Integer.MIN_VALUE;
            boolean isChange = false;

            for (int j = 0; j < 3; j++){
                maxScore = Math.max(maxScore, score[j]);
            }for (int j = 0; j < 3; j++){
                if (score[j] == maxScore){
                    if (board[j] != 1) {
                        board[j] = 1;
                        isChange = true;
                    }
                } else {
                    if (board[j] != 0){
                        board[j] = 0;
                        isChange = true;
                    }
                }
            }

            if (isChange) cnt++;
        }

        System.out.println(cnt);
    }
}