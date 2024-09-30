import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int cnt = 0;

        for (int i = x; i <= y; i++){
            // int to string ) String s = i + "";
        	boolean isPelin = true;
        	
        	String s = Integer.toString(i);
        	
        	String sRev = new StringBuilder(s).reverse().toString();
        	
        	if (s.equals(sRev)) cnt++;
        }
        
        System.out.println(cnt);
    }
}