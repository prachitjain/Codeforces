import java.util.Scanner;

public class UFM_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no1 = sc.nextLine();
        String no2 = sc.next();
        String result = "";
        for(int i=0; i<no1.length(); i++) {
            if (Integer.parseInt(no1.charAt(i) + "")==Integer.parseInt(no2.charAt(i)+"")) {
                result =result + "0";                
            } else {
                result = result + "1";
            }
        }
        System.out.println(result);
        sc.close();
    }
}
