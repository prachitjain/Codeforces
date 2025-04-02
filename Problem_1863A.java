import java.util.Scanner;

public class Problem_1863A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
                   if(s.equals("abc")) {
                System.out.println("YES");
                continue;
            }
            String c1 = s.substring(0, 1);
            String c2 = s.substring(1,2);
            String c3 = s.substring(2);

            if((c1+c3+c2).equals("abc") || (c3+c2+c1).equals("abc") || (c2+c1+c3).equals("abc")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
