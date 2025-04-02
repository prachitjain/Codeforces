import java.util.Scanner;

public class Sol_Bana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Price of Bananas");
        int k = sc.nextInt();
        // System.out.println("Money Soldier got");
        int p = sc.nextInt();
        // System.out.println("No. of Bananas he needs");
        int n = sc.nextInt();

        int sum = 0;
        int total = 0;

        for(int i=0; i<n; i++) {
            sum = (i+1)*k;
            total = total + sum; 
        }
        if(p>=total) {
            System.out.println(0);
        } else {
            System.out.println(total - p);
        }
        sc.close();
    }
}
