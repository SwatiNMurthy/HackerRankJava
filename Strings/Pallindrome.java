import java.io.*;
import java.util.*;

public class Pallindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        int i,j,flag=1;
        for(i=0,j=A.length()-1;i<A.length()/2;i++,j--){
            if(A.charAt(i) != A.charAt(j)) {
                flag = 0;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}