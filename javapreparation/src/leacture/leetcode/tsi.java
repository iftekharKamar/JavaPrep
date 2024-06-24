package leetcode;

import java.util.Arrays;

public class tsi {
    public static int removeDuplicates(int[] nums) {
        int k=1;
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                i++;
            }else{
                k++;
                nums[k-1]=nums[i];
                i++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] ={0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(nums);
        int k = removeDuplicates(nums);
        for(int i =0;i<k;i++){
            System.out.print(nums[i]);
        }
    }
}
