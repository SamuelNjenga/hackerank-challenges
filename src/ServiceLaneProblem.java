import java.util.Scanner;

 class ServiceLaneProblem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter the number of width measurements:");
            int n = input.nextInt();
            System.out.println("Enter the number of test cases:");
            int t = input.nextInt();
            int [] array = new int[n];
            for(int i = 0;i < n;i++){
                array[i] = input.nextInt();
            }
//        int min = Integer.MAX_VALUE;
            System.out.println("Enter the start and end indexes");
            for(int i = 0;i < t;i++){
                int start = input.nextInt();
                int end = input.nextInt();
                int min = array[start];
                for(int j = start + 1 ; j <= end;j++){
                    if( min > array[j]){
                        min = array[j];
                    }
                }
                System.out.println(min);
            }
        }finally{
            input.close();

        }

    }
}
