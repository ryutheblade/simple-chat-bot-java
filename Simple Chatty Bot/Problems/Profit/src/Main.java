import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ks = new Scanner(System.in);
        double m = ks.nextInt();
        double p = ks.nextInt();
        double k = ks.nextDouble();

        p = 1 + (p / 100);

        int i = 0;
        while (m < k) {
            m *= p;
            i++;
        }
        System.out.println(i);
        
    }
}
