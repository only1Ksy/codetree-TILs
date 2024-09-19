import java.util.*;

class Person {
    int personId;   // 사람 번호
    int cheeseId;   // 먹은 치즈 번호
    int eatenTime;  // 먹은 시간
    int sickTime;   // 아픈 시간

    public Person(){}
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peopleCount = input.nextInt();  // 사람 수
        int cheeseCount = input.nextInt();  // 치즈 수
        int eatingRecordsCount = input.nextInt(); // 치즈를 먹은 기록 수
        int sickRecordsCount = input.nextInt();   // 아픈 기록 수

        Person[] people = new Person[peopleCount + 1];  // 사람들 정보 저장
        for (int i = 0; i <= peopleCount; i++) {
            people[i] = new Person();
        }

        // 상한 치즈 여부를 저장하는 배열
        boolean[] spoiledCheese = new boolean[cheeseCount + 1];

        // 몇 번째 사람이, 몇 번째 치즈를, 몇 초에 먹었는가?
        Person[] eatingRecords = new Person[eatingRecordsCount + 1];
        for (int i = 1; i <= eatingRecordsCount; i++) {
            eatingRecords[i] = new Person();
            eatingRecords[i].personId = input.nextInt(); // 사람 번호
            eatingRecords[i].cheeseId = input.nextInt(); // 먹은 치즈 번호
            eatingRecords[i].eatenTime = input.nextInt(); // 먹은 시간
        }

        // 몇 번째 사람이, 몇 초에 아팠는가?
        for (int i = 0; i < sickRecordsCount; i++) {
            int personId = input.nextInt(); // 아픈 사람 번호
            people[personId].sickTime = input.nextInt(); // 아프기 시작한 시간
        }

        // 각 사람의 기록을 바탕으로 상한 치즈 찾기
        for (int personId = 1; personId <= peopleCount; personId++) {
            if (people[personId].sickTime != 0) {  // 아픈 사람이 있을 때
                for (int j = 1; j <= eatingRecordsCount; j++) {
                    if (eatingRecords[j].personId == personId &&
                        eatingRecords[j].eatenTime < people[personId].sickTime) {
                        // 아파지기 전에 먹은 치즈라면 상한 치즈로 표시
                        spoiledCheese[eatingRecords[j].cheeseId] = true;
                    }
                }
            }
        }

        // 상한 치즈를 먹은 사람들을 찾고, 중복 방지
        Set<Integer> affectedPeople = new HashSet<>();

        for (int cheeseId = 1; cheeseId <= cheeseCount; cheeseId++) {
            if (spoiledCheese[cheeseId]) {  // 해당 치즈가 상했을 때
                for (int j = 1; j <= eatingRecordsCount; j++) {
                    if (eatingRecords[j].cheeseId == cheeseId) {
                        // 해당 치즈를 먹은 사람 추가
                        affectedPeople.add(eatingRecords[j].personId);
                    }
                }
            }
        }

        // 약이 필요한 사람의 수 출력
        System.out.println(affectedPeople.size());
    }
}