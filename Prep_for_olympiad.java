import java.util.Scanner;

public class Prep_for_olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int probs = 0;
            for(int j=0; j<n; j++) {
                a[j] = sc.nextInt();
                b[j] = sc.nextInt();
            }
            for(int j=0; j<n-1; j++) {
                if(a[j] >= b[j+1]) {
                    probs = probs + a[j];
                }
            }
            // For last day - Loop is not covering it and It is always added
            probs = probs + a[n];
            System.out.println(probs);
        }
        sc.close();
    }
}
