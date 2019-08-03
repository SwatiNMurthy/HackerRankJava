import java.io.*;
import java.util.*;

public class StringsIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        A = A.substring(0,1).toUpperCase()  + A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase()  + B.substring(1).toLowerCase();
        System.out.println(A+" "+B);
    }
}