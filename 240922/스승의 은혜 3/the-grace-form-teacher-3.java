import java.util.*;

class Student implements Comparable<Student>{
    int p; int s;

    public Student(){}

    public Student(int p, int s){
        this.p = p;
        this.s = s;
    }

    public int compareTo(Student student){
        return (this.p + this.s) - (student.p + student.s);
        // == (오름차순 정렬)
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Student [] stu = new Student[n];
        int b = input.nextInt();

        // 선물 가격 입력
        for (int i = 0; i < n; i++) {
            int p = input.nextInt();
            int s = input.nextInt();

            stu[i] = new Student(p, s);
        }

        int max = 0;

        // 학생들의 선물 가격을 오름차순으로 정렬
        Arrays.sort(stu);

        // 각 학생에 대해 할인 적용을 시도
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;

            // 쿠폰을 적용한 가격
            sum += (stu[i].p / 2 + stu[i].s);
            count++;

            // 나머지 학생들의 선물 가격을 더함
            for (int j = 0; j < n; j++) {
                if (i == j) continue;  // 이미 할인한 학생 제외
                if (sum + stu[j].p + stu[j].s > b) break;  // 예산 초과시 종료
                sum += (stu[j].p + stu[j].s);
                count++;
            }

            // 최대 학생 수 갱신
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}