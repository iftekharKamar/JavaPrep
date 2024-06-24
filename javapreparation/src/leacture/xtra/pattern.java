package leacture.xtra;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class pattern {

    //hollow rectangle
    public static void hollow_rectangle(int rows,int col){

        for(int i =1;i<=rows;i++){
            for(int j =1;j<=col;j++){
                if(i==1||i==rows||j==1||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }

    public static void rotated_halfPyramid(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumber(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void floydsTriangle(int n){
        int c=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void binarytriangle(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();

        }
    }

    public static void halfPyramid(int n){

       for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void butterfly(int n){
        for(int i =0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void solidRohmbus(int n){
        for(int i =0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void hollowRohmbus(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=n;j++){
                if(i==1||i==n||j==1||j==n) {
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        diamond(4);
//        hollowRohmbus(5);
//        butterfly(5);
//        binarytriangle(5);
//           floydsTriangle(5);
//        invertedHalfPyramidWithNumber(5);
//        hollow_rectangle(5,5);
//        rotated_halfPyramid(5  );
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
   /*
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    */
        //inverted start pattern

        /*for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */




        //print character pattern
        /*
        char ch ='A';
        for(int i =1;i<=n;i++){
            for(int cha = 1;cha<=i;cha++){
                System.out.print(ch);
                ch++;
            }
            ch ='A';
            System.out.println();
        }

         */
    }

}
