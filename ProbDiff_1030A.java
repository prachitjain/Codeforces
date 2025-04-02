import java.util.Scanner;

public class ProbDiff_1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diff[] = new int[n];
        for(int i=0; i<n; i++) {
            diff[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(diff[i] == 1) {
                System.out.println("HARD");
                break;
            } else if ( i==n-1 ) {
                System.out.println("EASY");
            }
        }
        sc.close();
    }
}
