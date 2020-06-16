import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string received on earth");
        String s = input.nextLine();
        int numChanged = 0;
        for(int i = 0; i < s.length();i++){
            if(i % 3 == 1){
                if(s.charAt(i) != 'O')
                    numChanged++;
            }
            else{
                if(s.charAt(i) != 'S')
                    numChanged++;
            }
        }
        System.out.println(numChanged);
    }
}
