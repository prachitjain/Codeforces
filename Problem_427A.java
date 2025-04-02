import java.util.Scanner;

public class Problem_427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int input, sum = 0, neg = 0;
        for(int i=0; i<t; i++) {
            input = sc.nextInt();
            if(input > 0) {
                sum += input;
            } else if (input < 0) {
                if(sum>0) {
                    sum--;
                } else {
                    neg++;
                }
            }
        }
        System.out.println(neg);
        sc.close();
    }
}
