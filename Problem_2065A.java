import java.util.Scanner; 
public class Problem_2065A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String W = sc.next();

            System.out.println(solve(W));
        }
        sc.close();
    }
    public static String solve(String W) {
        return W.substring(0, W.length() - 2) + "i";
    }
}
