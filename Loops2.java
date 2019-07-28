import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double x=0, temp=a;
            for(int j=0;j<n;j++){
                x = temp + Math.pow(2,j) *b;
                System.out.print(Math.round(x)+ " ");
                temp = x;
            }
            System.out.println("");
        }
        in.close();
    }
}
