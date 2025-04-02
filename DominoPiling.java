import java.util.Scanner;
public class DominoPiling {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int calc = (M * N)/2;
        
        System.out.println(calc);
        sc.close();
    }
}
