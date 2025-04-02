import java.util.Scanner;

public class Calculating_Function_486A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n%2 == 0) {
            long evenSum = n/2;
            System.out.println(evenSum);
        } else {
            long oddSum = -(n+1)/2;
            System.out.println(oddSum);
        }
        sc.close();
    }
}

// Here is the Problem agar value of n 100000000 hui to loop time badha dega and memory bhi bhar dega

// recursion laga to boht zyada time and memory badh jaa rhi hai as you know stacks mai kaam hoga layer k upar layer etc

// to koi or logic lagana padega

// ACCEPTED!!!!!!!!!!!!!!
