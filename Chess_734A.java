import java.util.Scanner;

public class Chess_734A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter No. of Games");
        int n = sc.nextInt();
        sc.nextLine();
        // System.out.println("Data of games won by D/A");
        String data = sc.nextLine();

        int Ant = 0;
        int Dan = 0;

        for(int i=0; i<n; i++) {
            if(data.charAt(i) == 'A') {
                Ant++; 
            } else if(data.charAt(i) == 'D'){
                Dan++;
            }
        }
        if (Ant>Dan) {
            System.out.println("Anton");
        } else if (Ant<Dan) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        sc.close();
    } 
}

