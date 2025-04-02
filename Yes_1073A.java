import java.util.Scanner;

public class Yes_1073A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String x = "YES";
        for(int i=0; i<t; i++) {
            String s = scan.next();
            if(x.equalsIgnoreCase(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
