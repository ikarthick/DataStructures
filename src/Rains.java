import java.util.*;

public class Rains {
    public static void main(String args[]){
        Integer arr[] ={0,3,0,2,1,0,1,3,2,1,3,1};
      Vector<Integer> h = new Vector<>();
        Collections.addAll(h,arr);
        System.out.println(h);
        Vector<Integer> left = new Vector<>();
        Vector<Integer> right = new Vector<>();
        int maxLeft = 0;
        for(int i=0;i< h.size();i++){
            if(h.get(i)>maxLeft){
               maxLeft = h.get(i);
            }
            left.add(maxLeft);
        }
        System.out.println(left);

        int maxRight =0;
        for(int j=h.size()-1;j>=0;j--){
            if(h.get(j)>maxRight){
                maxRight = h.get(j);
            }
            right.add(0,maxRight);
        }

        System.out.println(right);

        int totalRain =0;

        for(int i=0;i<h.size();i++){
           int rainStored = Math.min(left.get(i),right.get(i)) - h.get(i);
           totalRain += rainStored;
        }
        System.out.println(totalRain);

    }
}
