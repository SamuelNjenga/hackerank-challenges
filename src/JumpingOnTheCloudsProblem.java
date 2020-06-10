import java.util.Scanner;

public class JumpingOnTheCloudsProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c[] = new int[n];
        for (int d = 0; d < n; d++) {
            c[d] = input.nextInt();
        }
        int jumps = 0;
        int cloud = 0;
        while (cloud != n - 1) {
            if (cloud + 2 < n && c[cloud + 2] != 1) {
                cloud = cloud + 2;
            } else {
                cloud = cloud + 1;
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
