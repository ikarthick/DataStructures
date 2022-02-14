import java.util.Scanner;
import java.util.Vector;

public class ArrayProducts {
    public static void main(String[] args){
       // Integer[] input ;
        Vector<Integer> v1 = new Vector<>();     // {1 2 3 4 5}
        Vector<Integer> output = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            v1.add(sc.nextInt());
        }
        System.out.println(v1);

        //logic
        for(int i=0;i<n;i++){
            int prod =1;
           for(int j=0;j<n;j++){
               if(i!=j) {
                   prod = prod * v1.get(j);
               }
           }
           output.add(prod);
        }
        System.out.println(output);
    }
}
