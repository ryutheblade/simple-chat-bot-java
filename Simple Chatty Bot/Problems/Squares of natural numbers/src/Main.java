import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int maxNum = userInput.nextInt();
        int square;
        int i = 1;
        do {
            square = i * i;
            System.out.println(square);
            i++;
        } while (i * i <= maxNum);
    }
}