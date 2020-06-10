import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlorProblem {
    public static int binarysearch(int [] a,int x){
        Arrays.sort(a);
        int high = a.length;
        int low = 0;
        int mid = (low + high) / 2;
        while(low < high){
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]<x){
                low = mid +1;
            }
            else if(a[mid]>x){
                high = mid -1;
            }

        }
        return 0;
    }
    public static void solve(int m,int n,int [] a){
        int i;
        int index = 0;
        for(i=0;i<n;i++){
            if(!(a[i]>=m)){
                // index = binarysearch(a,(m-a[i]));
                // if(index != 0){
                for(int j = 0;j<n;j++){
                    if(j != i){
                        if(a[j]==(m-a[i])){
                            i +=1;
                            j+=1;
                            System.out.println(i +"" +j);
                            return;
                        }
                        //     }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0= 0;a0 < t;a0++){
            int m  = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i = 0;a_i < n;a_i++){
                a_i = in.nextInt();
            }
            solve(m,n,a);
        }
    }
}
