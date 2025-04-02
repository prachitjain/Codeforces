import java.util.Scanner;

public class Vanya_677A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int height = sc.nextInt();

        int guys[] = new int[n];
        int counter = 0;
        for(int i=0; i<n; i++) {
            guys[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(guys[i]>height){
                counter = counter + 2;
            } else {
                ++counter;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
