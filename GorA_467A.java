import java.util.Scanner;

public class GorA_467A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p[] = new int[n];
        int q[] = new int[n];
        int ct = 0;

        for(int i=0; i<n; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(q[i]-p[i] >= 2) {
                ct++;
            }
        }
        System.out.println(ct);
        sc.close();
    }
    
}
