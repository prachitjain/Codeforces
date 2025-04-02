import java.util.Scanner;

public class Candies_1335A {

    public static int getResult(int n) {
        int value = 0;
        if(n == 1 || n == 2) {
            return 0;
        }
        if( n%2 == 0) {
            value = (n / 2) - 1;
        } else {
            value = (n - 1)/2;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
        int n = scan.nextInt();
        int result = getResult(n);
        System.out.println(result);
        }
        scan.close();
    }
}
