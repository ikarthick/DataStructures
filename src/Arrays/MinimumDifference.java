package Arrays;

import java.util.*;

public class MinimumDifference {
    public static void main(String[] args) {
        Integer[] a1 = {23,5, 10, 17, 30};
        Integer[] a2 = {26, 134, 135, 14, 19, 34};
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        Collections.addAll(v1, a1);
        Collections.addAll(v2, a2);
      //  System.out.println(v1);
        int MIN_DIFF = Integer.MAX_VALUE;

        //logic
        for(int i=0;i<v1.size();i++){
            for (int j=0;j<v2.size();j++){
                int x = v1.get(i);
                int res =Math.abs(x - v2.get(j));
                if(MIN_DIFF > res){
                    MIN_DIFF = res;
                }
            }
        }
        System.out.println(MIN_DIFF);
    }
}
