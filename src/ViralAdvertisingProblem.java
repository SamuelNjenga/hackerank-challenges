import java.util.Scanner;

public class ViralAdvertisingProblem {
    public static void main(String[] args) {
        int n = 5;
        int likes = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = input.nextInt();
        for (int i = 1; i <= days; i++) {
            likes += Math.floor(n / 2);
            n = (int) (3 * Math.floor(n / 2));
        }
        System.out.println("The number of likes after " + days + " days is " + likes);
    }
}
