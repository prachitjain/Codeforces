import java.util.Scanner;

public class Fox$Snake_510A {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);;
        int n = scan.nextInt();
        int m = scan.nextInt();

        String a = "";
        String b = "";
        for(int i=0; i<m-1; i++) {
            a += "#";
            b += ".";
        }
        a += "#";
        boolean flag = true;
        for(int i=0; i<n; i++) {
            if( i%2 == 0) {
            System.out.println(a);
            } else {
                if(flag) {
                    System.out.println(b + "#");
                    flag = !flag;
                } else {
                    System.out.println("#" + b);
                    flag = !flag;
                }
            }
         }
         scan.close();
    }
}