import java.io.*;
import java.util.*;

public class LongestBand {
    public static void main(String args[]){

        Vector<Integer> vec = new Vector<>();
        Integer arr[] = {1,9,3,0,18,5,2,4,10,7,12,6};
       // Arrays.sort(arr);
        Collections.addAll(vec,arr);
        System.out.println(vec);

        //Logic
        int result = band(vec);
        System.out.println(result);

    }

    static int band(Vector<Integer> arr){
        int n = arr.size();
        Set<Integer> s = new HashSet<>();

        //Data inside a set
        s.addAll(arr);

        //Iterate over the arr
        int largestLen = 1;
        int cnt =1;

        for(int i : s){
            int next_num = i+1;
            while(s.contains(next_num)){
//                next_no++;
                cnt++;
                next_num++;
            }
            largestLen = Math.max(cnt,largestLen);

        }

      return largestLen;
    }

}
