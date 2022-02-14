import jdk.jfr.Description;

import java.util.*;

public class MinimumSwaps {
    public static void main(String args[]){
      //input vec
        Vector<Integer> vec = new Vector<>();
      Integer[] arr = {5,4,3,2,1};
      Collections.addAll(vec,arr);
      System.out.println(vec);

      //sorted ref vector
      Vector<Integer> sorted = new Vector<>();
      Collections.addAll(sorted,arr);
        Collections.sort(sorted);
        System.out.println(sorted);

        Map<Integer,Boolean> checklist = new HashMap<>();
        for(int i: vec){
            checklist.put(i,false);
        }
        System.out.println(checklist);

        int result = minSwaps(vec, sorted, checklist);

        if(result==0)
            System.out.println("The input is already sorted");
        else
            System.out.println("Min Swaps : "+result);

    }
   // @Description("returns minSwap")
    static int minSwaps(Vector<Integer> vec, Vector<Integer> sorted, Map<Integer,Boolean> checklist){
        int swapCount =0;


        for(int i=0;i<=vec.size()-1;){
            if(Objects.equals(vec.get(i), sorted.get(i))){
                checklist.put(vec.get(i), true);
            }

            //System.out.println(checklist.get(i));
            int x = vec.get(i);
            if(!checklist.get(x)) {

                int location = sorted.indexOf(x); //indexOf('value') function can also be used
                int y = vec.get(location);

               Collections.swap(vec, i, location);
                System.out.println(vec);
                swapCount++;
                System.out.println(checklist);

            }
            else i++;
        }
        return swapCount;
    }

    //returns swap location comparing with sorted vector


}
