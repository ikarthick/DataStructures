package Strings;
import java.io.*;
import java.util.*;
public class StringBasics {

    //TODO:Logic to Reverse a Number
    public static void main(String args[]){
//        Integer num ;
//        StringBuilder rev = new StringBuilder("");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//
//        int n = num.toString().length();
//        for(int i=0;i<=n-1; ++i){
//        int x = num%10;
//        num = num/10;
//        rev.append(x);
//        }
//        System.out.println(rev);
        Vector<Integer> v1 = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            v1.add(sc.nextInt());
        }

        Integer[] arr = new Integer[]{1,2,6,3,4,5};
        

//        System.out.println("Num to be searched");
//        int x = sc.nextInt();
        //int res = binarySearch(v1,x);
      //  System.out.println("Found in "+res +" position");

        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(v1,arr);
        System.out.println("Capacity :"+v1.capacity()+" Size :"+v1.size());
     System.out.println(v1);

     System.out.println(v1.elementAt(0));
     System.out.println(v1.get(0));

     }

    public static int binarySearch(Vector<Integer> vec,int numToSearch){
        System.out.println(vec);
        Collections.sort(vec); //sorting
        int siz = vec.size();
        int mid = (vec.get(0) +vec.get(siz-1))/2;
        while(numToSearch > mid){
             mid = mid+1;
        }
        return 1;
    }
}
