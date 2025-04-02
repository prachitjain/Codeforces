import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int TM = 0;
            int R1rem = 0;
            int R2rem = 0;

            if(m < a) {
                R1rem = 0;
                TM = TM + m;
            } else if (m == a) {
                R1rem = 0;
                TM = TM + m;
            } else {
                R1rem = Math.abs(m - a);
                TM = TM + a;
            }
            if(m < b) {
                R2rem = 0;
                TM = TM + m;
            } else if (m == b) {
                R2rem = 0;
                TM = TM + m;
            } else {
                R2rem = Math.abs(m - b);
                TM = TM + b;
            }
            int RemainSeats = R1rem + R2rem;
           if(RemainSeats > c) {
            TM = TM + c;
           } else if(RemainSeats == c){
            TM = TM + RemainSeats;
           } else if(RemainSeats < c) {
            TM = TM + RemainSeats; 
           }
            System.out.println(TM);
        }
        sc.close();
    }
}