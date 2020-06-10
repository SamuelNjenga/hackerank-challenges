
import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersOfBallsProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of q : ");
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter n for number of containers value : ");
            int n = input.nextInt();
            int[][] M = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("Enter values : ");
                    M[j][k] = input.nextInt();
                }
            }
            int[] rt = new int[n];
            int[] ct = new int[n];
            for (int l = 0; l < n; l++) {
                for (int p = 0; p < n; p++) {
                    rt[l] += M[l][p];
                    ct[p] += M[l][p];
                }
            }
            Arrays.sort(rt);
            Arrays.sort(ct);
            String answer = "Possible";
            for (int l = 0; l < n; l++) {
                if (rt[l] != ct[l]) {
                    answer = "Impossible";
                }

            }
            System.out.println("The answer is " + answer);
        }
    }
}
