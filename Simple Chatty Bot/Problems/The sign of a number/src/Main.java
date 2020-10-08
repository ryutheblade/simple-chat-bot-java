import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        int ans = 0;
        if (number > 0) {
            ans = 1;
        }
        if (number < 0) {
            ans = -1;
        }
        if (number == 0) {
            ans =  0;
        }
        return ans;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}