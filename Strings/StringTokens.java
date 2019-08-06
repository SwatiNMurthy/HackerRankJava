import java.io.*;
import java.util.*;

public class StringTokens {
    /*
     * s is composed of any of the following: English alphabetic letters, blank
     * spaces, exclamation points (!), commas (,), question marks (?), periods (.),
     * underscores (_), apostrophes ('), and at symbols (@).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // int i=0;
        String arr[] = new String[s.length()];
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        s = s.substring(i);
    
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        arr = s.split("[, !?._'@]+");
        System.out.println(arr.length);
        for (String a : arr) {
            System.out.println(a.trim());
        }

    }
}