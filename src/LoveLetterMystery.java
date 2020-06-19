import java.util.Scanner;

public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times : ");
        int T = Integer.parseInt(input.nextLine());
        for(int i = 0; i < T;i++){
            String s = input.nextLine();
            long result = 0;
            for(int j = 0;j < s.length() / 2;j++){
                System.out.println(Math.abs(s.charAt(j)));
                result += Math.abs(s.charAt(j) - s.charAt(s.length() - j - 1));
            }
            System.out.println(result);
        }
    }
}
