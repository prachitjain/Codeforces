import java.util.Scanner;

public class Problem_1742A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            System.out.println(solve(a,b,c));
        }
        input.close();
    }

    public static String solve(int a, int b, int c) {
        if( a + b == c || b + c == a || a + c == b) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
