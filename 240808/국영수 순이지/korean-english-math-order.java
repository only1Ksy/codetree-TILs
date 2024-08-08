import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(){}

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Student student){
        
        if (this.kor == student.kor){

            if (this.eng == student.eng){
                return student.math - this.math;
            }

            return student.eng - this.eng;
        }
        return student.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Student [] s = new Student[n];

        for (int i = 0; i < n; i++){
            String na = input.next();
            int k = input.nextInt();
            int e = input.nextInt();
            int m = input.nextInt();

            s[i] = new Student(na, k, e, m);
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++){
            System.out.println(s[i].name + " " + s[i].kor + " " + s[i].eng + " " + s[i].math);
        }
    }
}