import java.util.*;

class People{
    String name;
    String address;
    String city;

    public People(){
        this.name = "";
        this.address = "";
        this.city = "";
    }

    public People(String name, String address, String city){
        this.name = name;
        this.address = address;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        People [] p = new People[n];
        String [] s = new String[n];

        for (int i = 0; i < n; i++){
            p[i] = new People();
            p[i].name = input.next();
            s[i] = p[i].name;
            p[i].address = input.next();
            p[i].city = input.next();
        }

        Arrays.sort(s);

        for (int i = 0; i < n; i++){
            if (s[n-1] == p[i].name){
                System.out.println("name " + p[i].name);
                System.out.println("addr " + p[i].address);
                System.out.println("city " + p[i].city);
                break;
            }
        }
    }
}