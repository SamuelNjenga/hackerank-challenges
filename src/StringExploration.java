import java.util.Scanner;

public class StringExploration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string received on earth");
        String s = input.nextLine();
        int numChanged = 0;
        for(int i = 0;i < s.length();i++){
            if(i%5 == 1 || i%4 == 2 ||i % 4 == 1){
                if(s.charAt(i) != 'O' ){
                    numChanged++;
                }
            }
            else if(i%4 == 3){
                if(s.charAt(i) != 'K' ){
                    numChanged++;
                }
            }else{
                if(s.charAt(i) != 'B' ){
                    numChanged++;
                }
            }
        }
        System.out.println(numChanged);
    }
}
