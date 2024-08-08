import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int a;
    int b;
    int c;

    public Student(){}

    public Student (String name, int a, int b, int c){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int compareTo(Student student){
        return (this.a + this.b + this.c) - (student.a + student.b + student.c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++){
            String na = input.next();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            s[i] = new Student(na, a, b, c);
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++){
            System.out.println(s[i].name + " " + s[i].a + " " + s[i].b + " " + s[i].c);
        }
    }
}