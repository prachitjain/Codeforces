import java.util.Scanner;

public class ColorStone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String stone = sc.next();

        int counter = 0;
        char last = stone.charAt(0);

        for(int i=0; i<n; i++) {
            if(stone.charAt(i) == last) {
                counter++;
            } else {
                last = stone.charAt(i);
            }
        }
        System.out.println(counter-1);
        sc.close();
    }

}