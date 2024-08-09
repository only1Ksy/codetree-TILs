import java.util.*;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(){}

    public Student (int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public int compareTo(Student student){
        if (this.height != student.height)
            return this.height - student.height;
        return student.weight - this.weight;
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

            s[i] = new Student(h, w, i+1);
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++){
            System.out.println(s[i].height + " " + s[i].weight + " " + s[i].num);
        }
    }
}