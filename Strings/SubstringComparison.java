import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String[] a = new String[s.length()-(k-1)];
        int i=0;
        while((i+k)<=s.length()){
            a[i] = s.substring(i, i+k);
            //System.out.println(a[i]);
            i++;
        }
        //a[i] = null;
        smallest = a[0];
        largest = a[0];
        
        for(i=1;i<a.length;i++){
            if (a[i].compareTo(smallest) < 0)  smallest = a[i];
            if (a[i].compareTo(largest) > 0)  largest = a[i];
            /* if (a[i].compareTo(smallest) < 0) smallest = a[i];
            if (a[i].compareTo(largest) > 0) largest = a[i]; */
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}