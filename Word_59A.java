import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int count1 = 0, count2 = 0;
        
        String clone = name.toLowerCase();

        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) == clone.charAt(i)) {
                ++count1;
            } else if(name.charAt(i) != clone.charAt(i)) {
                ++count2;
            }
        }

        if(count1>=count2) {
            System.out.println(name.toLowerCase());
        } else {
            System.out.println(name.toUpperCase());
        }
        sc.close();
    }
}
