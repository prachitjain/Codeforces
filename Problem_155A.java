import java.util.Scanner; 

public class Problem_155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int min =  a[0];
        int max = a[0];
        for(int i=0; i<n; i++) {
            if(a[i] > max) {
                counter++;
                max = a[i];
            }
            if(a[i] < min) {
                counter++;
                min = a[i];
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
