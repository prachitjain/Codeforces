import java.util.Scanner;

public class Problem_200B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        double totalVolume = n * 100;
        double containingVolume = 0;

        for (int i = 0; i < n; i++) {
            double t = input.nextInt();
            containingVolume += t;          
        }

        System.out.println(containingVolume/totalVolume * 100);
        input.close();
    }
}
