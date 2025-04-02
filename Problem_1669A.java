import java.util.Scanner;

public class Problem_1669A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int rating = input.nextInt();
            System.out.println("Division " + division(rating));
        }
        input.close();
    }

    private static int division(int rating) {
        if(rating >= 1900) {
            return 1;
        } else if(rating >= 1600 && rating <= 1899) {
            return 2;
        } else if(rating >= 1400 && rating <= 1599) {
            return 3;
        } else {
            return 4;
        }
    }
}
