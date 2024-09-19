import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 입력 읽기
        int n = input.nextInt(); // 사람 수
        int m = input.nextInt(); // 치즈 수
        int d = input.nextInt(); // 치즈를 먹은 기록 수
        int s = input.nextInt(); // 아픈 기록 수

        // 치즈를 먹은 기록
        // records[i] = {personId, cheeseId, eatenTime}
        int[][] records = new int[d][3];
        for (int i = 0; i < d; i++) {
            records[i][0] = input.nextInt(); // personId
            records[i][1] = input.nextInt(); // cheeseId
            records[i][2] = input.nextInt(); // eatenTime
        }

        // 아픈 기록
        // sickTimes[personId] = sickTime
        int[] sickTimes = new int[n + 1]; // 1-based index
        Arrays.fill(sickTimes, Integer.MAX_VALUE); // 초기화: 모든 사람의 sickTime을 무한대로 설정

        for (int i = 0; i < s; i++) {
            int personId = input.nextInt();
            int sickTime = input.nextInt();
            sickTimes[personId] = sickTime;
        }

        // 상한 치즈 식별
        boolean[] isSpoiled = new boolean[m + 1]; // 1-based index

        for (int i = 1; i <= n; i++) {
            if (sickTimes[i] != Integer.MAX_VALUE) { // 사람이 아픈 경우
                for (int j = 0; j < d; j++) {
                    if (records[j][0] == i && records[j][2] < sickTimes[i]) {
                        isSpoiled[records[j][1]] = true; // 상한 치즈 기록
                    }
                }
            }
        }

        // 상한 치즈를 먹은 사람 추적
        Set<Integer> affectedPeople = new HashSet<>();

        for (int i = 0; i < d; i++) {
            if (isSpoiled[records[i][1]]) { // 상한 치즈일 때
                affectedPeople.add(records[i][0]); // 해당 치즈를 먹은 사람 추가
            }
        }

        // 결과 출력
        System.out.println(affectedPeople.size());
    }
}