import java.util.Scanner;

// Problem 112A

public class Petya_and_Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String first1 = sc.next();
        String second1 = sc.next();

        String first = first1.toLowerCase();
        String second = second1.toLowerCase();

        if(first.compareTo(second) == 0) {
            System.out.println("0");
        } else if (first.compareTo(second) > 0) {
            System.out.println("1");
        } else if (first.compareTo(second) < 0) {
            System.out.println("-1");
        }
        sc.close();
    }
}
