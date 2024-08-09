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

    public int compareTo(People p){
        if (this.height != p.height)
            return this.height - p.height;
        return p.weight - this.weight;
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

        for (int i = 0; i < n; i++){
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}