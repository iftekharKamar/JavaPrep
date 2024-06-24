package leacture.Backtracking;

public class backtrack {

  public static void Arraytrace(int i,int arr[],int a){
       if(i==arr.length){
           printArr(arr);
           return;
       }
       arr[i]=a;
       Arraytrace(i+1,arr,a+1);
       arr[i] = arr[i]-2;
   }

   public static void findPermutation(String str ,String ans){
      //base case
       if(str.length()==0){
           System.out.println(ans);
           return;
       }

       //recusrion O(n*n!)
       for(int i =0;i<str.length();i++){
           char curr = str.charAt(i);
           String Newstr = str.substring(0,i)+str.substring(i+1);
           findPermutation(Newstr,ans+curr);
       }
   }

   public static void printArr(int arr[]){
      for(int i =0;i< arr.length;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
   }
   public static void findSubset(String str,String ans,int i ){
      //base case
       if(i==str.length()){
           System.out.println(ans);
           return;
       }

       //recursion
       //Yes choice
       findSubset(str,ans+str.charAt(i),i+1);
       //No choice
       findSubset(str,ans,i+1);
   }

    public static void main(String[] args) {
//       int arr[] = new int[5];
//        Arraytrace(0,arr,1);
//        printArr(arr);

        String str = "abc";
      findPermutation(str,"");
    }
}
