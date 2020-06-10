import java.util.Scanner;

class DesignerPdfViewerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
        }
        String word  = input.next();
        int max = 0;
        for(int i = 0;i < word.length();i++){
            int f = h[(int) (word.charAt(i) - 'a')];
            System.out.println(word.charAt(i) - 'a');
            if(f > max){
                max = f;
            }
        }
        System.out.println("Area is "+(word.length() * max));
    }
}