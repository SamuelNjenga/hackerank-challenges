import java.util.Scanner;

public class AngryProfessorProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int T = input.nextInt();
        for (int t = 0; t < T; t++) {
            int N = input.nextInt(); //Total number of students who have arrived
            int K = input.nextInt(); //No of students required for a session to continue
            int counter = 0;

            for (int i = 0; i < N; i++) {
                int a = input.nextInt(); //Arrival time per student
                if (a <= 0) {
                    counter++;
                }
            }
            if (counter < K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();

    }
}

