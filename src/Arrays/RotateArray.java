package Arrays;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int n=6;
        int rotate=2;
        int rot = rotate;
        List<Integer> ls = new LinkedList<>();
        ls.add(1);ls.add(2);
        ls.add(3);ls.add(4);
        ls.add(5);ls.add(6);
        System.out.println(ls);
        List<Integer> ls1 = new LinkedList<>();
        for(int i=0;i<=rot;){
            if(rotate>0){
                int val = ls.get(i);
                ls.add(val);
                ls.remove(i);
                System.out.println(ls);
                rotate--;
                if(rotate==0)
                    break;
            }

        }


    }
}
