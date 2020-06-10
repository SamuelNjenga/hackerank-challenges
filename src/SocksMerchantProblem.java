import java.util.Arrays;
import java.util.Scanner;

public class SocksMerchantProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int colors[] = new int[101];
        for(int i = 0;i < n;i++){
            int c = input.nextInt();
            colors[c]++;
        }
        System.out.println(Arrays.stream(colors).map(count -> count/2).sum());


    }
}
