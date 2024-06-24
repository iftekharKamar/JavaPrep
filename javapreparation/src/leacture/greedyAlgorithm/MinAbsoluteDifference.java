package greedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int A[] ={4,8,1,7};
        int B[] ={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff =0;
        for(int i =0;i<A.length;i++){
            minDiff =Math.abs(A[i]-B[i]);
        }
        System.out.println(minDiff);
    }
}
