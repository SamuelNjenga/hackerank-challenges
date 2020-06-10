import java.util.Arrays;
import java.util.Scanner;

public class GreedyFloristProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.println("Enter the number of flowers to be purchased");
        n = input.nextInt();
        System.out.println("Enter the number of customers");
        k = input.nextInt();

        int c[] = new int[n];
        System.out.println("Enter the various flowers");
        for (int i = 0; i < n; i++) {
            c[i] = input.nextInt();
        }
        Arrays.sort(c);
        int result = 0;
        if (k >= n) {
            for (int i = 0; i < n; i++) {
                result += c[i];
            }
            System.out.println(result);
        } else {
            //Processing
            int x = 0;
            while (n > 0) {
                for (int i = 0; i < k; i++) {
                    result += c[n - 1] * (x + 1);
                    n--;
                    if (n == 0) {
                        break;
                    }
                }
                x++;

            }
            System.out.println(result);
        }
    }
}
