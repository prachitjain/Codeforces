import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        int poss[][] = new int[n][3];
// Input of array
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                poss[i][j] = sc.nextInt();
            }
        }

        int chances = 0;
        int smallest = 0;

        for(int i=0; i<n; i++) {
            int j =0;
            smallest = poss[i][j] + poss[i][j+1] + poss[i][j+2];

            if(smallest/2 ==1 || smallest/3 == 1){
                chances++;
            } else {
                smallest = 0;
            }
        }
        System.out.println(chances);
        sc.close();
    }
}
