import java.util.Scanner;

public class AB_Again_1999A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int n = scan.nextInt();
            int result = (n/10) + (n%10);
            System.out.println(result);
        }
        scan.close();
    }
}
