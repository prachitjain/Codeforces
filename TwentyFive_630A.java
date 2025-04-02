/*Tenth base digits of 5^n will always be 25 */

import java.util.Scanner;

public class TwentyFive_630A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if(n-n/2 == n) {
            n = n/2;
        } 
        System.out.println("25");  
        scan.close();    
    }
}
