import java.util.HashSet;
import java.util.Scanner;

public class Problem_469A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        HashSet<Integer> set = new HashSet<>();

        int XLevels = scan.nextInt();
        for (int i = 0; i < XLevels; i++) {
            set.add(scan.nextInt());
        }

        int YLevels = scan.nextInt();
        for (int i = 0; i < YLevels; i++) {
            set.add(scan.nextInt());
        }

        if(set.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        scan.close();
    }
}