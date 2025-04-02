import java.util.Scanner;

public class Problem_228A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int c3 = input.nextInt();
        int c4 = input.nextInt();
        int colorNeeded = 0;

        if(c1 == c2 || c1 == c3 || c1 == c4) {
            colorNeeded++;
        }
        if(c2 == c3 || c2 == c4) {
            colorNeeded++;
        }
        if(c3 == c4) {
            colorNeeded++;
        }

        System.out.println(colorNeeded);
        input.close();
    }
}
