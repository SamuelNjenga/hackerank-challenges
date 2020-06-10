
import java.util.Scanner;

public class MinimumDistancesProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = input.nextInt();
        int array [] = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = input.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(array[i] == array[j] && j - i < min){
                    min = j - i;
                }
            }
        }
        System.out.println(min);
    }
}
