import java.util.Scanner;
import java.util.HashSet;

public class Problem_520A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        String str = input.next();
        str = str.toLowerCase();
        if(n < 26) {
            System.out.println("NO");
        } else {
            System.out.println(solve(str));
        }
    }

    private static String solve(String str) {
        char c[] = str.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (Character character : c) {
            set.add(character);
        }

        if(set.size() == 26) {
            return "YES";
        } else {
            return "NO";
        }
    }
}



