import java.util.Scanner;

public class BonAppetitProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number of items to be ordered");
        int n = input.nextInt();
        int priceArray[] = new int[n];
        System.out.println("Enter the cost of each item ");
        for (int i = 0; i < n; i++) {
            priceArray[i] = input.nextInt();
        }
        System.out.println("Zero based index of item Anna doesn't eat");
        int k = input.nextInt();
        System.out.println("Amount of money Anna contributes");
        int b = input.nextInt();
        for (int l = 0; l < n; l++) {
            if (priceArray[l] != priceArray[k]) {
                sum += priceArray[l];
            }
        }
        sum = sum / 2;
        if (sum == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println("Anna will be refunded " + (b - sum));
        }
    }
}
