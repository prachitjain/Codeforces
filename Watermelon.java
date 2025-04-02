import java.util.*;

// Problem 4A

 public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Weight = sc.nextInt();

        if(Weight%2 ==0 && Weight !=2){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        sc.close();
    } 
}