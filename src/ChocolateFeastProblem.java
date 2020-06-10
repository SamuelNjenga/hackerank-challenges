import java.util.Scanner;

public class ChocolateFeastProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Bobby's initial amount of money");
        int money = input.nextInt();
        System.out.println("Enter the cost of each bar");
        int cost = input.nextInt();
        System.out.println("Enter the wrappers required for a bar");
        int bonus = input.nextInt();
        int wrappers = money / cost;
        int total = wrappers;
        while (wrappers >= bonus) {
            int more = wrappers / bonus;
        }


    }
}
