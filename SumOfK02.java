import java.util.Scanner;

public class SumOfK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long ans = 0;
		//AB間の最も小さい数
		for(long i = A;; i++) {

		}

		//AB間の最も大きい数

		//個数

		//こたえ
		ans = M + N;

		System.out.println(ans);
	}
}



/*
//打田さんのメールより
import java.util.*;

public class SumOfK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long a = (A >= 0 ? (A + K -1) / K : A / K);
		long b = (B >= 0 ? (B + K -1) / K : B / K);
		long ans = K*((b-1) * b / 2 - (a - 1) * a / 2);
		System.out.println(ans);
	}
}
*/

/*
//プロコンで提出したもの（4つTLE）
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
        for(int j  = 0; j < list.size(); j++) ans += list.get(j);
        System.out.println(ans);
	}

}
*/

/*
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

*/