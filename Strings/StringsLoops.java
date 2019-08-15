import java.io.*;
import java.util.*;

public class StringsLoops {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] array = new String[n];

        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }
        scan.close();
        for(i=0;i<n;i++){
            for(int j=0;j<array[i].length();j++){
                if (j%2==0) System.out.print(array[i].charAt(j));
            }
            System.out.print(" ");
            for(int j=0;j<array[i].length();j++){
                if (j%2==1) System.out.print(array[i].charAt(j));
            }
            System.out.println();
        }
    }
}

