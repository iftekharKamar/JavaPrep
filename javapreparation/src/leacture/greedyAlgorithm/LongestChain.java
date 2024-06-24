package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class LongestChain {
    public static void main(String[] args) {
        int arr[][] ={{5,24},
                {39,60},
                {5,28},
                {27,40},
                {50,90}};
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        int chainLen =1;
        int chainEnd = arr[0][1];

        for(int i =1;i<arr.length;i++){
            if(arr[i][0] >chainEnd){
                chainLen++;
                chainEnd =arr[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
