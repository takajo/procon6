import java.util.Scanner;

public class ConvertGengo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char w = str.charAt(0);
        int r = Integer.parseInt(str.substring(1));

        switch (w) {
        case 'M':
            System.out.println(1867 + r);
            break;
        case 'T':
            System.out.println(1911 + r);
            break;
        case 'S':
            System.out.println(1925 + r);
            break;
        case 'H':
            System.out.println(1988 + r);
            break;
        case 'X':
            System.out.println(2018 + r);
            break;
        }
    }

}
