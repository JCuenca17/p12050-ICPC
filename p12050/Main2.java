package p12050;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
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
        System.out.println("Ingrese un numero para obtener palindrome: ");
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int counter = 1;

        while (list.size() < n) {
            if (esPalindrome(counter))
                list.add(counter);
            counter++;
        }
        //System.out.println(list);
        System.out.println(list.get(list.size() - 1));
    }
}
