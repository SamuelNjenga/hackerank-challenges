import java.util.Scanner;

public class AppleAndOrangeProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Start and End of Sam's house");
        int s = input.nextInt();
        int t = input.nextInt();
        System.out.println("Enter the Location of the Apple tree and Orange tree");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter the number of Apples and Oranges available");
        int m = input.nextInt();
        int n = input.nextInt();
        int[] apple = new int[m];
        int app = 0;
        System.out.println("Enter distances of the Apple Trees");
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = input.nextInt();
            if (a + apple[apple_i] >= s && a + apple[apple_i] <= t) {
                app++;
            }
        }
        int[] orange = new int[n];
        int or = 0;
        System.out.println("Enter distances of the Orange Trees");
        for (int orange_i = 0; orange_i < n; orange_i++) {
            apple[orange_i] = input.nextInt();
            if (b + apple[orange_i] >= s && b + apple[orange_i] <= t) {
                or++;
            }
        }
        System.out.println(app);
        System.out.println(or);
    }
}
