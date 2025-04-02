import java.util.Scanner;
import java.util.Arrays;

public class Problem_40A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t = input.next();
        String s = input.next();

        String w = "";

        for(int i=0; i<t.length(); i++) {
            w = t.charAt(i) + w;
        }

        if(s.equals(w)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
