import java.util.Arrays;
import java.util.Scanner;

public class Problem_1624A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int a[] = new int[n];

            for (int j = 0; j < a.length; j++) {
                a[j] = input.nextInt();
            }

            Arrays.sort(a);

            int min_steps = a[n - 1] - a[0]; 
            System.out.println(min_steps);
        }
    }
}
