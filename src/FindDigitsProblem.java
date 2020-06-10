import java.util.Scanner;

public class FindDigitsProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of test cases : ");
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            int temp = array[i];
            while (temp != 0) {
                if (temp % 10 != 0) {
                    if (array[i] % (temp % 10) == 0)
                        count++;
                    temp /= 10;
                }
                System.out.println(count);
            }
        }
    }
}
