import java.util.Scanner;

public class Problem_1950A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(a >= b || b == c) {
                System.out.println("NONE");
            } else if (c > b) {
                System.out.println("STAIR");
            } else {
            System.out.println("PEAK");
            } 
        }
        scan.close();
    }
}
