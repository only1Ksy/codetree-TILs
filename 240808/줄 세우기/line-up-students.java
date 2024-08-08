import java.util.*;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(){}

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public int compareTo(Student stu){
        if (this.height != stu.height && this.weight != stu.weight)
            return stu.height - this.height;
        if (this.weight != this.weight)
            return stu.weight - this.weight;
        return this.num - stu.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Student [] s = new Student[n];

        for (int i = 0; i < n; i++){
            int h = input.nextInt();
            int w = input.nextInt();
            int nu = i + 1;

            s[i] = new Student(h, w, nu);
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++){
            System.out.println(s[i].height + " " + s[i].weight + " " + s[i].num);
        }
    }
}