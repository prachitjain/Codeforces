import java.util.Scanner;

public class Problem_996A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = input.nextInt();  
        int ans = 0;
        int a[] = {100,20,10,5,1};

        for(int i = 0; i < a.length; i++) {
            ans += balance/a[i];
            balance = balance%a[i];
        }

        System.out.println(ans);
        input.close();
    }
}
