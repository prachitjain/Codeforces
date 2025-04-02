import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int twalk = 0;
            int days = 0;
            while(n>twalk) {
                if(n>twalk) {
                    twalk = twalk + a;
                    days++; 
                }
                if(n>twalk) {
                    twalk = twalk + b;
                    days++;
                }
                if(n>twalk) {
                    twalk = twalk + c;
                    days++;
                }
            }
            System.out.println(days);
        }
        sc.close();
    }
}
