import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long ans = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = (int)a; i < b; i++) if(i%c == 0) list.add(i);

        for(int j  = 0; j < list.size(); j++) {
        	ans += list.get(j);
        }
        System.out.println(ans);
	}

}
