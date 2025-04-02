import java.util.Scanner;

public class CreatingWords_1985 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++) {
            String s = scan.next();
            String t = scan.next();

            char a = s.charAt(0);
            char b = t.charAt(0);

            s = s.substring(1);
            t = t.substring(1);

            String newA = b + s;
            String newB = a + t;

            String result = newA + " " + newB;
            System.out.println(result);
        }
        scan.close();
    }   
}
