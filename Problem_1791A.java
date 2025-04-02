import java.util.Scanner;

public class Problem_1791A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            String n = input.next();
            System.out.println(solve(n));
        }
        input.close();
    }
    
    public static String solve(String n) {
        String value = "codeforces"; 
        if(value.contains(n)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
