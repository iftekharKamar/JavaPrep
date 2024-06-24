package leacture.TwoDArray;

import java.sql.SQLSyntaxErrorException;

public class practice {

    public static void TotalNumber(int n[][],int key){
        int c=0;
        for(int i =0;i<n.length;i++){
            for(int j =0;j<n[0].length;j++){
                if(n[i][j]==key){
                    c++;
                }
            }
        }
        System.out.print(c);
    }

    public static void sumofNumbersInRow(int n[][]){
        int sum =0;

            for(int j=0;j<n[0].length;j++){
              sum +=n[1][j];
            }

        System.out.print(sum);
    }
    public static int removeduplicate(int nums[]){

    int j =1;
        for(int i =1;i<nums.length-1;i++){
        if(nums[i]!=nums[i-1]){
            nums[j]=nums[i];
            j++;
        }

    }
        return j;
    }
    public static void printArr(int n[]){

    }
    public static void main(String[] args) {
       int nums[] ={3,2,2,3};
       nums[0]=nums[1];
        for(int i: nums){
            System.out.print(i);
        }


    }
}
