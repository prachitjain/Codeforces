import java.util.Scanner;

public class Hulk_705A {
    public static void printSentence(int n, int i) {
        if(i==n) {
            return;
        }
        if(i % 2 == 0) {
            System.out.print("I hate ");
        } else {
            System.out.print("I love ");
        }
        if(i == n-1) {
            System.out.print("it");
        } else {
            System.out.print("that ");
        }
        printSentence(n, i+1);
    }



    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printSentence(n, 0);
        scan.close();

    }
}