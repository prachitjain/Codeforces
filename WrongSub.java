import java.util.Scanner;

public class WrongSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input of N and K from user
        // System.out.println("Enter value of n");
        int n = sc.nextInt();
        // System.out.println("Enter value of k");
        int k = sc.nextInt();
        
            //Counter
        int i = 0; 
        while(i<k) {
            if(n%10 == 0) {
                n = n/10;
            } else {
                n--;
            }     
            i++;
        }
        System.out.println(n);
        sc.close();
    }
}
