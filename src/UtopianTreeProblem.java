import java.util.Scanner;

public class UtopianTreeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int n = scanner.nextInt();
        int array[] = new int[n];
        int height = 1;

        System.out.println("Enter the number of cycles for each test case");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == 0) {
                System.out.println(1);
            } else {
                int count = 1;
                for (int j = 1; j <= array[i]; j++) {
                    if (j % 2 == 0) {
                        count = count + 1;
                    } else {
                        count = count * 2;
                    }
                }
                System.out.println(count);
            }
        }

    }
}
