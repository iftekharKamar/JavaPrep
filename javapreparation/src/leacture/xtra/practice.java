package leacture.xtra;
import java.util.*;
public class practice {

    public static boolean isDistinct(int n[]) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static int[] rotateArray(int n[],int indx){
        int start =0;
        int k =indx;
        while(start<k){
            int temp =n[start];
             n[start] = n[k];
            n[k] = temp;
            start++;
            k++;
        }
        return n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n[] ={1,1,1,3,3,4,3,2,4,2};
//        System.out.print(isDistinct(n));

        int n[] ={0,1,2,4,5,6,7};
       System.out.println(rotateArray(n,3));

    }
}
