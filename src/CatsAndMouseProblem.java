import java.util.Scanner;

public class CatsAndMouseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of queries : ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter position for Cat A");
            int x = input.nextInt();
            System.out.println("Enter position for Cat B");
            int y = input.nextInt();
            System.out.println("Enter position for the Mouse");
            int z = input.nextInt();
            if(x==y || y - z == z - x || x - z == z - y){
                System.out.println("Mouse C Escaped After the 2 Cats Fought");
            }
            else if(z - y > z - x){
                System.out.println("Cat A Caught the Mouse");
            }
            else {
                System.out.println("Cat B Caught the Mouse");
            }
        }
    }
}
