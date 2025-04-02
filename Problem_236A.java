import java.util.Scanner;

import java.util.HashSet;


public class Problem_236A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        int result = countDistint(userName);

        if(result % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        input.close();
    }

    private static int countDistint(String userName) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < userName.length(); i++) {
            set.add(userName.charAt(i));
        }

        return set.size();
    }
}
