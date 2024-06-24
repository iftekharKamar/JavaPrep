package leacture.sorting;

public class BubbleSort {

    public static void swap(int a,int b){
        int temp = a;
        a =b; b = temp;
    }

    public static void BubbleSort(int n[]){
        for(int i =0;i<n.length-1;i++){
            for(int j =0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int n[]){
        for(int i =0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
  int n[] ={5,4,1,3,2};
  BubbleSort(n);
  printArr(n);


    }
}
