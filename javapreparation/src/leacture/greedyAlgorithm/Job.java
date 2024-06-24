package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Job {
    public static void main(String[] args) {
        int arr[][] ={{4,20},{1,10},{1,40},{1,30}};

        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

       int profit =0;
        int count =0;
        int time = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(time< arr[i][0]){
                time =arr[i][0];
                count++;
                profit+= arr[i][1];
            
            }
        }
        System.out.println(count);
        System.out.println(profit);

    }
}
