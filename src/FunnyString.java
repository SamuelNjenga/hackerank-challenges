import java.util.Scanner;

public class FunnyString {
    public static String processString(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        for(int i = 1;i < str.length();i++){
            int strDiff = Math.abs(str.charAt(i)- str.charAt(i - 1));
            int refDiff = Math.abs(reverse.charAt(i)- reverse.charAt(i - 1));
            if(strDiff != refDiff){
                return "Not Funny";
            }
        }
        return "Funny";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Strings : ");
        int numStrings = Integer.parseInt(input.nextLine());

        for(int i = 0;i < numStrings;i++){
            System.out.println("Enter the String");
            String s  = input.nextLine();
            System.out.println(processString(s));
        }


    }
}
