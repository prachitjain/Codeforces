import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int capacity = 0;
        int passenger = 0;

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            passenger = passenger -a[i] + b[i];

            if(capacity<passenger) {
                capacity = passenger;
            }
        }
        System.out.println(capacity);
        sc.close();
    }
}
