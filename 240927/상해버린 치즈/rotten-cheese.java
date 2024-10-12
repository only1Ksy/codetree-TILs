import java.util.*;

class Person {
    int personNum;
    int eatenCh;
    int eatenT;
    int sickT;

    public Person(){}
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // 사람 수
        int M = input.nextInt();  // 치즈 수
        int d = input.nextInt();  // 먹은 기록 수
        int s = input.nextInt();  // 아픈 기록 수

        // 사람들의 아픈 시간 기록
        Person[] people = new Person[n + 1];
        for (int i = 0; i <= n; i++) {
            people[i] = new Person();
        }

        // 치즈를 먹은 기록 저장
        Person[] eatingRecords = new Person[d + 1];
        for (int i = 1; i <= d; i++) {
            eatingRecords[i] = new Person();
            eatingRecords[i].personNum = input.nextInt();  // 몇 번째 사람
            eatingRecords[i].eatenCh = input.nextInt();    // 몇 번째 치즈
            eatingRecords[i].eatenT = input.nextInt();     // 몇 초에 먹었는지
        }

        // 아픈 사람의 기록
        for (int i = 0; i < s; i++) {
            int personNum = input.nextInt();  // 몇 번째 사람이
            people[personNum].sickT = input.nextInt();  // 몇 초에 아팠는지
        }

        // 상한 치즈 후보 탐색
        boolean[] spoiledCheese = new boolean[M + 1];  // 각 치즈가 상했는지 여부
        Arrays.fill(spoiledCheese, true);  // 초기에는 모든 치즈가 상했다고 가정

        // 아픈 사람들 중에서 상한 치즈 후보를 걸러냄
        for (int i = 1; i <= n; i++) {
            if (people[i].sickT != 0) {  // 아픈 사람에 대해
                for (int j = 1; j <= M; j++) {
                    boolean ateBeforeSick = false;

                    // 그 사람이 j번째 치즈를 아픈 시간 전에 먹었는지 체크
                    for (int k = 1; k <= d; k++) {
                        if (eatingRecords[k].personNum == i && eatingRecords[k].eatenCh == j) {
                            if (eatingRecords[k].eatenT < people[i].sickT) {
                                ateBeforeSick = true;
                                break;
                            }
                        }
                    }

                    // 해당 치즈를 아픈 시간 전에 먹지 않았다면 상한 치즈에서 제외
                    if (!ateBeforeSick) {
                        spoiledCheese[j] = false;
                    }
                }
            }
        }

        // 상한 치즈를 먹은 사람들을 세기 위한 작업
        int maxPeopleAffected = 0;
        for (int i = 1; i <= M; i++) {
            if (spoiledCheese[i]) {  // 상한 치즈일 가능성이 있는 경우
                Set<Integer> affectedPeople = new HashSet<>();

                // 그 치즈를 먹은 사람들을 기록
                for (int j = 1; j <= d; j++) {
                    if (eatingRecords[j].eatenCh == i) {
                        affectedPeople.add(eatingRecords[j].personNum);
                    }
                }

                maxPeopleAffected = Math.max(maxPeopleAffected, affectedPeople.size());
            }
        }

        // 결과 출력
        System.out.println(maxPeopleAffected);
    }
}