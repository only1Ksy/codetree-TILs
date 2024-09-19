import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 사람 수
        int M = input.nextInt(); // 치즈 수
        int D = input.nextInt(); // 치즈 먹은 기록 수
        int S = input.nextInt(); // 아픈 기록 수

        // 치즈 먹은 기록 저장
        ArrayList<int[]> eatenRecords = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int p = input.nextInt(); // 사람 번호
            int m = input.nextInt(); // 치즈 번호
            int t = input.nextInt(); // 먹은 시간
            eatenRecords.add(new int[] {p, m, t});
        }

        // 아픈 기록 저장
        int[] sickTimes = new int[N+1]; // 각 사람이 언제 아팠는지 저장, 0이면 아프지 않은 것
        for (int i = 0; i < S; i++) {
            int p = input.nextInt(); // 사람 번호
            int t = input.nextInt(); // 아프기 시작한 시간
            sickTimes[p] = t;
        }

        // 상한 치즈를 추정할 배열
        boolean[] isSpoiled = new boolean[M+1]; // 각 치즈가 상했는지 여부
        Arrays.fill(isSpoiled, true); // 처음엔 모든 치즈가 상했다고 가정

        // 각 아픈 사람이 먹은 치즈들 중 상한 치즈만 남기기
        for (int i = 1; i <= N; i++) {
            if (sickTimes[i] > 0) { // 아픈 사람
                for (int[] record : eatenRecords) {
                    int person = record[0];
                    int cheese = record[1];
                    int time = record[2];

                    if (person == i && time < sickTimes[i]) {
                        isSpoiled[cheese] = true; // 아프기 전에 먹은 치즈는 의심 치즈
                    } else if (person == i && time >= sickTimes[i]) {
                        isSpoiled[cheese] = false; // 아프기 이후 먹은 치즈는 상한 치즈가 아님
                    }
                }
            }
        }

        // 최대 약이 필요한 사람 수 세기
        Set<Integer> peopleToMedicate = new HashSet<>();
        for (int[] record : eatenRecords) {
            int person = record[0];
            int cheese = record[1];

            if (isSpoiled[cheese]) {
                peopleToMedicate.add(person);
            }
        }

        System.out.println(peopleToMedicate.size());
    }
}