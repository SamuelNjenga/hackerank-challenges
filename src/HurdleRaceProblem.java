import java.util.Scanner;

public class HurdleRaceProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int doses = 0;
        int max = 0;
        System.out.println("Enter the number of hurdles : ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter maximum height Sam can jump : ");
        int k = input.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (array[j] > max) {
                max = array[j];
            }
            if (max > k) {
                doses = max - k;
            }
        }
        System.out.println("The doses required to reach highest hurdle is : " + doses);
    }
}
