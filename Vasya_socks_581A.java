import java.util.Scanner;

public class Vasya_socks_581A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a > b) {
            System.out.print(b + " ");
        } else {
            System.out.print(a + " ");
        }
        int result = Math.abs(a - b) / 2; 
        System.out.println(result);
        scan.close();
    }
}
