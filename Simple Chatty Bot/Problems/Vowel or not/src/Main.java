import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char m = Character.toLowerCase(ch);
        return m == 'a' || m == 'e' || m == 'o' || m == 'u' || m == 'i';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}