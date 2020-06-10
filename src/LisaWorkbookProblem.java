import java.util.Scanner;

class LisaWorkBookProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of chapters :");
        int n = input.nextInt();
        System.out.println("Enter the maximum number of problems per page :");
        int max = input.nextInt();
        int special = 0;
        int p = 1;
        // int array [] = new int[n];

        System.out.println("Enter the number of questions per chapter :");
        for (int i = 0; i < n; i++) {
            int t = input.nextInt();
            int c = 0;
            for (int h = 1; h <= t; h++) {
                c++;
                if (p == h) {
                    special++;
                }
                if (c == max) {
                    c = 0;
                    p++;
                }
            }
            if (c != 0) {
                p++;
            }
        }
        System.out.println(special);
    }
}
