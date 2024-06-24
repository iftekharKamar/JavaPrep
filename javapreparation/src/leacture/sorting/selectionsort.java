package leacture.sorting;

public class selectionsort {

    public static void selectionsort(int n[]){
        for(int i =0;i<n.length-1;i++){
            int minPos = i;
            for(int j =i+1;j<n.length;j++){
                if(n[minPos]>n[j]){
                    minPos =j;
                }
                //swap
                int temp = n[minPos];
                n[minPos] = n[i];
                n[i] = temp;
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
        selectionsort(n);
        printArr(n);
    }
}
