import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];

        for(int i=1; i<=n; i++) {
            a[sc.nextInt()] = i;
        }
        for(int i=1; i<=n; i++) {
            System.out.print(a[i]+ " ");
        }
        sc.close();
    }
}
