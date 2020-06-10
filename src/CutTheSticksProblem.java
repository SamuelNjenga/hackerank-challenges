import java.util.Arrays;
import java.util.Scanner;

class CutTheSticksProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sticks:");
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        int gone = 0;
        int cut = 0;
        for (int i = 0; i < n; i++) {
            if (cut < array[i]) {
                System.out.println(n - gone);
                cut = array[i];
            }
            gone += 1;
        }


    }
}
