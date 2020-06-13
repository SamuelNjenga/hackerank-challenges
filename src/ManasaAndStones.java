import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int T = input.nextInt();
        int n = input.nextInt() - 1;
        int a = input.nextInt();
        int b = input.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = n * min;
        Set<Integer> used = new HashSet<Integer>();
        for (int j = 0; j < n; j++) {
            if (!used.contains(sum)) {
                System.out.println(sum + " ");
                used.add(sum);
            }
            sum -= min;
            sum += max;
        }
        if (used.contains(sum))
            System.out.println();
        else
            System.out.println(sum);

    }

}
