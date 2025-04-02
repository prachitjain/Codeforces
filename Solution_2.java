import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0; k<t; k++) {
            String a = sc.next();
            String b = "";
            for(int i=0; i<a.length(); i++) {
                if(a.charAt(i) == 'p') {
                    b = "q" + b;
                }
                if(a.charAt(i) == 'q') {
                    b =  "p" + b; 
                }
                if(a.charAt(i) == 'w') {
                    b = "w" + b;
                }
            }
            System.out.println(b);
        }
        sc.close();
    }
}