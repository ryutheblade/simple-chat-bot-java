import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inp = scanner.nextInt();
        int count = 0;
        int n = 0;
        while (n < inp) {
            n++;
            for (int j = 0; j < n; j++) {
                count += 1;
                if (count > inp) {
                    break;
                }
                System.out.print(n + " ");
            }
        }
    }
}