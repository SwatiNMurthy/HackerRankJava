import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s; int i=1;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            s = scan.nextLine();
            System.out.println(i+" "+s);
            i++;
        }
        scan.close();
    }
}

