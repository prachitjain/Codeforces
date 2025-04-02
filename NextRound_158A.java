import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int contestants[] = new int[n]; 
        for(int i=0; i<n; i++) {
            contestants[i] = scan.nextInt();
        }


        int pass = n - (n-k);

        for(int i=k+1; i<n; i++) {
            if(contestants[i] == k) {
                pass = pass + 1 ;
            }
        }
        
        System.out.println(pass);
        scan.close();
    }
}
