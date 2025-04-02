import java.util.Scanner;

public class Problem_785A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        int t = input.nextInt();
        int noOfFaces = 0;
        for (int i = 0; i < t; i++) {

            String n = input.next();

            if(n.equals("Tetrahedron")) {
                noOfFaces += 4;
            } else if (n.equals("Cube")) {
                noOfFaces += 6;
            } else if (n.equals("Octahedron")) {
                noOfFaces += 8;
            } else if (n.equals("Dodecahedron")) {
                noOfFaces += 12;
            } else if (n.equals("Icosahedron")) {
                noOfFaces += 20;
            }
        }
        System.out.println(noOfFaces);  
    }  
}
