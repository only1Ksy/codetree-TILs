import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> al = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            String s = input.next();

            if (s.equals("push_back")){
                int num = input.nextInt();
                al.addLast(num);
            } else if (s.equals("push_front")){
                int num = input.nextInt();
                al.addFirst(num);
            } else if (s.equals("pop_front")){
                System.out.println(al.pollFirst());
            } else if (s.equals("pop_back")){
                System.out.println(al.pollLast());
            } else if (s.equals("size")){
                System.out.println(al.size());
            } else if (s.equals("empty")){
                System.out.println(al.isEmpty() ? 1 : 0);
            } else if (s.equals("front")){
                System.out.println(al.peekFirst());
            } else {
                System.out.println(al.peekLast());
            }
        }
    }
}