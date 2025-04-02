import java.util.Scanner;


public class Prob_158A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;
        int participants[] = new int[n];
        for(int i=0; i<n; i++) {
            participants[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(participants[i]>0) {
                if(participants[i] >= participants[k-1]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
