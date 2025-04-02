import java.util.Scanner;

public class Problem_1283A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0; i<t; i++) {
            int h = scan.nextInt();
            int m = scan.nextInt();
            int remainingTime = 1440 - (h*60 + m);
            System.out.println(remainingTime);
        }
        scan.close();
    }
}
