import java.util.Scanner;

public class Div_1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long move;
            if(a%b == 0 ) {
                move = 0;
            } else {
                move = b - (a%b);
            }
            System.out.println(move);
        }
        sc.close();
    }

}