import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean esPalindrome(int n) {
        String s = String.valueOf(n);
        int longitud = s.length();
        for (int i = 0; i < longitud; i += 2) {
            if (s.charAt(i) != s.charAt(longitud - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = scan.nextInt();
            int counter = 1;

            while (list.size() < n) {
                if (esPalindrome(counter))
                    list.add(counter);
                counter++;
            }

            if (n == 0) break;
            System.out.println(list);
            System.out.println(list.get(list.size() - 1));
        }
    }
}
