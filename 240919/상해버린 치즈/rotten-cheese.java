import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 사람 수
        int M = input.nextInt(); // 치즈 수
        int D = input.nextInt(); // 기록 수
        int S = input.nextInt(); // 아픈 기록 수

        // 사람의 아픈 시점을 저장하는 배열
        int[] sickT = new int[n + 1]; // 0번 인덱스는 사용하지 않음
        Arrays.fill(sickT, Integer.MAX_VALUE); // 초기화: 아무도 아프지 않음

        // 치즈를 먹은 기록을 저장하는 리스트
        List<CheeseRecord> records = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int person = input.nextInt();
            int cheese = input.nextInt();
            int time = input.nextInt();
            records.add(new CheeseRecord(person, cheese, time));
        }

        // 아픈 기록 저장
        for (int i = 0; i < S; i++) {
            int person = input.nextInt();
            int time = input.nextInt();
            sickT[person] = time; // 아픈 시점 기록
        }

        int maxMedicatedPeople = 0;

        // 모든 치즈를 상한 것으로 가정해보자
        for (int cheese = 1; cheese <= M; cheese++) {
            Set<Integer> medicatedPeople = new HashSet<>();

            for (CheeseRecord record : records) {
                if (record.cheese == cheese) {
                    // 이 치즈를 먹은 사람이 아프기 시작했는지 체크
                    int person = record.person;
                    int time = record.time;
                    if (time + 1 <= sickT[person]) { // 치즈를 먹은 시간이 아픈 시점보다 작거나 같아야 함
                        medicatedPeople.add(person);
                    }
                }
            }

            maxMedicatedPeople = Math.max(maxMedicatedPeople, medicatedPeople.size());
        }

        System.out.println(maxMedicatedPeople);
    }

    static class CheeseRecord {
        int person;
        int cheese;
        int time;

        CheeseRecord(int person, int cheese, int time) {
            this.person = person;
            this.cheese = cheese;
            this.time = time;
        }
    }
}