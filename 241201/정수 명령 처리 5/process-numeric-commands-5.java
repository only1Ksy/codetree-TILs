import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        ArrayList <Integer> al = new ArrayList<>();

        for (int i = 0; i < N; i++){
            String order = input.next();

            if (order.equals("push_back")){
                int n = input.nextInt();
                al.add(n);
            } else if (order.equals("pop_back")){
                al.remove(al.size() -1);
            } else if (order.equals("size")){
                System.out.println(al.size());
            } else if (order.equals("get")){
                int n = input.nextInt();
                System.out.println(al.get(n-1));
            }
        }
    }
}