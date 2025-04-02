import java.util.Scanner;

// Problem 282A

public class BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int x = 0;
        for(int i=0; i<n; i++) {

            name[i] = sc.nextLine();

            switch(name[i]) {
                case "X++" :
                case "++X" : x = x+1;
                break;
                case "--X" :
                case "X--" : x = x-1;
                break;
            }
        }
        System.out.println(x);
        sc.close();
}
}