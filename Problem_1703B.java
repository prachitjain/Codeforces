import java.util.HashMap;
import java.util.Scanner;

public class Problem_1703B {

    private static int getCharCount(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int count = 0;

        char[] cArr = str.toCharArray();

        for (char c : cArr) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
                count += 1;
            } else {
                charMap.put(c, 1);
                count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String str = input.next();
            int result = getCharCount(str);
            System.out.println(result);
        }
    }
}
