package Arrays;

import java.util.*;
public class Sample {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n:");
       int k = sc.nextInt();
       char base = 'A';
       int n = k*2;

        char[][] arr = new char[n][n];
          base  = (char) (base+k-1);

          int l=0;
        while(k>0) {  //Init k=3
            // l should be incremented for subsequent flows
            for (int i = l; i <= n - l - 1; i++) {  //n-2 for first flow
                for (int j = l; j <= n - l - 1; j++) {
                    arr[i][j] = (char) (base - l);
                }
            }
            k--;
            l++;
        }

        //Print 2D Array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}