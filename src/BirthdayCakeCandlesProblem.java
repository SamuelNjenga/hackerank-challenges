import java.util.Scanner;

public class BirthdayCakeCandlesProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for(int i = 0;i < n;i++){
            num = input.nextInt();
            if(num > max){
                sum = 1;
                max = num;

            }else if(num==max){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
