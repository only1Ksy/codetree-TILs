import java.util.*;

class People{
    String name;
    int height;
    double weight;

    public People(){}

    public People(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        People [] p = new People[5];

        for (int i = 0; i < 5; i++){
            String n = input.next();
            int h = input.nextInt();
            double w = input.nextDouble();

            p[i] = new People(n, h, w);
        }

        Arrays.sort(p, new Comparator<People>(){
            public int compare(People a, People b){
                return a.name.compareToIgnoreCase(b.name);
            }
        });

        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }

        System.out.println();

        Arrays.sort(p, new Comparator<People>(){
            public int compare(People a, People b){
                return b.height - a.height;
            }
        });

        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}