package leacture.TwoDArray;

import java.util.*;

public class TwoDArray {

    public static void Search(int n[][], int key){
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
               if( n[i][j]==key){
                  System.out.print("("+i+","+j+")");
               }
            }
        }
    }
    public static void spiralPrint(int n[][]){
       int top =0;
       int left =0;
       int right = n[0].length-1;
       int bottom = n.length-1;

       while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                System.out.print(n[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(n[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(n[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(n[i][left] + " ");
            }
            left++;
        }


    }

    public static void diagonalSum(int n[][]){
        int Primarysum =0;
        int secondarySum =0;
//        for(int i =0;i<n.length;i++){
//            for(int j =0;j<n[0].length;j++){
//                if(i==j){
//                   Primarysum +=n[i][j];
//                }
//                if(i+j==n.length-1){
//                    secondarySum += n[i][j];
//                }
//            }
//        }
        for(int i =0;i<n.length;i++){
            Primarysum +=n[i][i];
            if(i !=n.length-1-i){
                secondarySum +=n[i][n.length-i-1];
            }
        }
        System.out.print("PS = "+Primarysum+","+"SS = "+secondarySum);
    }

    public static boolean SearchKey(int n[][],int k){
      int row =0;
      int col =n[0].length-1;

      while(row<n.length && col>=0){
          if(n[row][col] ==k){
              System.out.println("found key at (" + row+","+col+")");
              return true;
          } else if (k<n[row][col]) {
              col--;
          }else{
              row++;
          }



      }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,25,37,48},
                {32,33,39,50}

        };

        int key =33;

        SearchKey(matrix,key);

    }
}
