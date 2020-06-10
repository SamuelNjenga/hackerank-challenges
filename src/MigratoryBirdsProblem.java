import java.util.Scanner;

class MigratoryBirdsProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the total birds");
        int n = input.nextInt();
        int[] typeCounts = new int[5];
        for (int i = 0; i < n; i++) {
            System.out.println("First");
            typeCounts[input.nextInt() - 1]++;
            System.out.println("Two");
        }

        int maxCount = 0;
        int maxtype = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Second");
            if (typeCounts[i] > maxCount) {
                System.out.println("If");
                maxCount = typeCounts[i];
                maxtype = i + 1;
                System.out.println("If");
            }
        }
        System.out.println(maxtype);
    }
}
