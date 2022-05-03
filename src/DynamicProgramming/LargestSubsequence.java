package DynamicProgramming;
import java.io.*;
import java.util.*;
public class LargestSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n =12;
       // Integer[] input = new Integer[n];
        Integer[] input = {0,4,12,2,10,6,9,13,3,11,7,15};
        Integer[] length = new Integer[n];
        Integer[] seq = new Integer[n];
//        for(int i=0;i<n;i++){
//            input[i]= sc.nextInt();
//        }

        Arrays.fill(length,1);
        Arrays.fill(seq,0);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if((input[j]<input[i]) && (length[i]<=length[j]+1)){
                        length[i] = length[j] + 1;
                        seq[i] = j;
                }
            }
        }

        //Arrays.sort(length)
            System.out.print("Length array: ");
        for(int i:length){
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.print("Seq array: ");
        for(int i:seq){
            System.out.print(" "+i);
        }

        //finding index of largest sub seq
        int max =1;
        int index = -1;

        for(int i=0;i<n;i++){
            if(max<length[i]) {
                max = length[i];
                index = i;
            }
        }
        System.out.println();

        System.out.println("Max length: "+ max+ ", Index: "+index);

        List<Integer> ls = new LinkedList<>();
        ls.add(input[index]);
        for(int i=0;i<max;i++){
           index = seq[index];
           ls.add(input[index]);
           if(index==0){
               break;
           }
        }
        Collections.sort(ls);
        System.out.println(ls);

    }

}
