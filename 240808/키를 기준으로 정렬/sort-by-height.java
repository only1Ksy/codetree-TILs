import java.util.*;

class People implements Comparable<People>{
    String name;
    int height;
    int weight;

    public People(){}

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(People people){
        if (this.height > people.height)
            return 1;
        else if (this.height < people.height)
            return -1;
        else   
            return 0;
        // == (오름차순 정렬)
        // return this.height - people.height
        // 내림차순 정렬의 경우 this.와 인자 순서 뒤바꿈
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        People [] p = new People[n];

        for (int i = 0; i < n; i++){
            String na = input.next();
            int h = input.nextInt();
            int w = input.nextInt();

            p[i] = new People(na, h, w);
        }

        Arrays.sort(p);
        // 혹은 comparable을 implement 하지 않고도 Arrays.sort만으로 가능
        // Arrays.sort(p, (a, b) -> a.height - b.height); 키 기준 오름차순 정렬

        for (int i = 0; i < n; i++){
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight); 
        }

    }
}