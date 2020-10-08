import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);

        int busHeight = in.nextInt();
        int bridgeCount = in.nextInt();
        int loop = 0;
        int bridgeHeight = 0;

        while (loop < bridgeCount) {
            bridgeHeight = in.nextInt();
            loop++;
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + loop);
                break;
            }
        }
        if (busHeight < bridgeHeight) {
            System.out.println("Will not crash");
        }
    }
}