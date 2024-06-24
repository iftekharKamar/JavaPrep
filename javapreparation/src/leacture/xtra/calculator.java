package leacture.xtra;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a:");
             int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("enter opertor :");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':System.out.print(a+b);
            break;
            case '-':System.out.print(a-b);
            break;
            case '*':System.out.print(a*b);
            break;
            case '/':System.out.print(a/b);
            break;
            case '%':System.out.print(a%b);
            break;
            default:System.out.print("provide valid operator");
        }
    }
}
