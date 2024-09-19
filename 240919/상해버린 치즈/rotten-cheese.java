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

        int n = input.nextInt();

        Person[] p = new Person[n+1];
        for (int i = 0; i < n+1; i++){
            p[i] = new Person();
        }

        int M = input.nextInt();
        // 상한 치즈 1, 멀쩡한 치즈 0
        int[] m = new int[M+1];

        int d = input.nextInt();
        int s = input.nextInt();

        // 몇 번째 사람이, 몇 번째 치즈를, 몇 초에 먹었는가?
        Person[] p1 = new Person[d+1];
        for (int i = 1; i <= d; i++){
            p1[i] = new Person();

            p1[i].personNum = input.nextInt();
            p1[i].eatenCh = input.nextInt();
            p1[i].eatenT = input.nextInt();
        }

        // 몇 번째 사람이, 몇 초에 아팠는가?
        for (int i = 0; i < s; i++){
            int pNum = input.nextInt();
            p[pNum].sickT = input.nextInt();
        }

        // 1-m 치즈까지 상한 치즈 감별 (아픈 사람이 아파지기 전에 먹었는가?)
        for (int i = 1; i <= n; i++){
            if (p[i].sickT != 0){ // 아픈 사람 번호 i
                for (int j = 1; j <= d; j++){
                    if (p1[j].personNum == i && p1[j].eatenT <= p[i].sickT - 1){ // 아프기 전에 먹었는가?
                        m[p1[j].eatenCh] = 1; // 먹은 치즈가 상함
                    }
                }
            }
        }

        // 상한 치즈 먹은 사람 수 세기 (중복)
        // set은 자동으로 중복 입력을 방지해 줌
        Set<Integer> medicatedPeople = new HashSet<>();

        for (int i = 1; i <= M; i++){
            if (m[i] == 1){ // 치즈가 상했을 때
                for (int j = 1; j <= d; j++){
                    if (p1[j].eatenCh == i) 
                        medicatedPeople.add(p1[j].personNum);
                }
            }
        }

        System.out.println(medicatedPeople.size());
    }
}