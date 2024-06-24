package leacture.String;

public class palindrome {

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }

        }
        return true;
    }

    public static float shortestDistance(String str){
        int x =0;
        int y =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            } else if (str.charAt(i)=='W') {
               x--;
            } else if (str.charAt(i)=='S') {
                y--;
            }else{
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
       char ch = Character.toUpperCase(str.charAt(0));
       sb.append(ch);
       for(int i =1;i<str.length();i++){
           if (str.charAt(i) ==' '&&i<str.length()-1) {
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
           }else{
               sb.append(str.charAt(i));
           }
       }
       return sb.toString();
    }

    public static String stringCompression(String str){
         String newStr ="";
        for(int i =0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }

        }
        return newStr;
    }



    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.print(stringCompression(str));

//         String largest = str[0];
//         for(int i =1;i<str.length;i++){
//             if(largest.compareToIgnoreCase(str[i])<0){
//                 largest = str[i];
//             }
//         }
//         System.out.print(largest);


    }
}
