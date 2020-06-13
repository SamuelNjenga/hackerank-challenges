import java.util.Scanner;

public class TaumAndBday {

    static int taumBday(int b, int w, int bc, int wc, int z) {
        int min1 = Math.min(b * bc + w * wc, b * bc + (b + z) * wc);
        int min2 = Math.min(min1, (wc + z) * b + w * wc);
        int min3 = Math.min(min2, (bc + z) * w + b * bc);
        return min3;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int testCases = input.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter the value of b and w");
            int b = input.nextInt();
            int w = input.nextInt();
            System.out.println("Enter the value of bc and wc and z");
            int bc = input.nextInt();
            int wc = input.nextInt();
            int z = input.nextInt();
            System.out.println(taumBday(b, w, bc, wc, z));
        }
    }
}
