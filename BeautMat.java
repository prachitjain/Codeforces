import java.util.Scanner;

public class BeautMat {
    public static void main(String[] args) {
         int Matrix[][] = new int[5][5];

         Scanner sc = new Scanner(System.in);
        int ans = 0;
         for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                Matrix[i][j] = sc.nextInt();
                
                int row = 0, col = 0;
                // if(Matrix[i][j] == 1 && i<=2 && j<=2) {
                //     row = 2-i;
                //     col = 2-j;
                //     ans = row + col;
                // } else if(Matrix[i][j] == 1 && i<=2 && j>2) {
                //     row = 2-i;
                //     col = j-2;
                //     ans = row + col;
                // } else if(Matrix[i][j] == 1 && i>2 && j<=2) {
                //     row = i-2;
                //     col = 2-j;
                //     ans = row + col;
                // } else if(Matrix[i][j] == 1 && i>2 && j>2){
                //     row = i-2;
                //     col = j-2;
                //     ans = row + col;
                if(Matrix[i][j] ==1) {
                row = Math.abs(i-2);
                col = Math.abs(j-2);

                ans = row + col;}
                
                // }
            }
         }
        System.out.println(ans);
        sc.close();
    }
}
