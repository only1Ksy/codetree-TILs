import java.util.*;

class Person {

    List <Integer> eatenCh = new ArrayList<>(); // 먹은 치즈 번호
    List <Integer> eatenT = new ArrayList<>(); // 치즈 먹은 시간

    List <Integer> sickT = new ArrayList<>(); //아픈 시간
    boolean isSick = false;
    public Person(){}
}

public class Main {
    public static void main(String[] args) {
        List <Person> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            arr.add(new Person());
        }

        int M = input.nextInt();
        // 상한 치즈, 멀쩡한 치즈
        List<Integer> m = new ArrayList<>();

        int d = input.nextInt();
        int s = input.nextInt();

        // 몇 번째 사람이, 몇 번째 치즈를, 몇 초에 먹었는가?
        for (int i = 0; i < d; i++){
            int personNum = input.nextInt();
            int cheeseNum = input.nextInt();
            int eatTime = input.nextInt();

            arr.get(personNum - 1).eatenCh.add(cheeseNum);
            arr.get(personNum - 1).eatenT.add(eatTime);
        }

        
        // 상한 치즈 번호 찾기
        for (int i = 0; i < s; i++){
            int pNum = input.nextInt();
            int sickT = input.nextInt();
            
            for (int j = 0; j < arr.get(pNum - 1).eatenCh.size(); j++){
                if (arr.get(pNum - 1).eatenT.get(j) < sickT){
                    m.add(arr.get(pNum - 1).eatenCh.get(j));
                }
            }
        }

        int[] sickNumArr = new int[m.size()];
        for (int i = 0; i < m.size(); i++){
            sickNumArr[i] = m.get(i);
        }

        int cnt = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).eatenCh.size(); j++){
                
                if (m.indexOf(arr.get(i).eatenCh.get(j)) > -1){
                    arr.get(i).isSick = true;
                    cnt++;
                    break;
                }
            }
        }

 
        
        System.out.println(cnt);
    }
}