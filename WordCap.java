import java.util.Scanner;

public class WordCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String first1 = name.substring(0, 1);
        String second = name.substring(1, name.length());
        
        String first = first1.toUpperCase();
        String Final = first + second;

        System.out.println(Final);
        sc.close();
    }
}


// To do it in single Line
// Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         scanner.close();

//         // Capitalize first letter
//         input = input.substring(0, 1).toUpperCase() + input.substring(1);

//         System.out.println(input);