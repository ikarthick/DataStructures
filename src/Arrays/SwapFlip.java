package Arrays;
import java.io.*;
import java.util.*;

public class SwapFlip {

    public static int remCost;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        System.out.println("Enter the String");
        String s= new String("");
        sc.nextLine();
        s = sc.nextLine();
        char[] seq = s.toCharArray();
        int cash = sc.nextInt();
        int costOfSwap = sc.nextInt();
        int costOfFlip = sc.nextInt();

         remCost = cash;  //default remaining cash

        if(costOfFlip>costOfSwap){
            Swap(seq,costOfSwap);
            Flip(seq,costOfFlip);
        }
        else
        {
            Flip(seq,costOfFlip);
            Swap(seq,costOfSwap);
        }
        String str = String.valueOf(seq);
       System.out.println(Integer.parseInt(str,2));


    }

    public static char[] Flip(char[] arr, int costOfFlip){
        for(int i=0;i<arr.length;i++){
            if(remCost >=0 && remCost >= costOfFlip) {
                if (arr[i] == '1') {
                    arr[i] = '0';
                    remCost = remCost - costOfFlip;
                }
            }
           }
        return arr;
    }

    public static char[] Swap(char[] arr, int costOfSwap){
        int temp=-1;
        if(remCost >=0 && remCost >= costOfSwap){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == '0')
                    temp = i;
            }
            if(!(temp== -1)) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == '1') {
                        char t = arr[i];
                        arr[i] = arr[temp];
                        arr[temp] = t;
                       remCost = remCost - costOfSwap;
                       break;
                    }
                }
            }
        }
        return arr;
   }
}
