import java.util.Scanner;

public class Soluton_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int n = scan.nextInt();
            System.out.println(n-1);
        }
        scan.close();
    }
}
