import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a==b) return false;
        a = a.toUpperCase();
        b = b.toUpperCase();
        int table[][] = new int[26][2];
        int i=0;
        while(i<a.length()){
            table[a.charAt(i)-65][0]++;
            i++;
        }
        i=0;
        while(i<b.length()){
            table[b.charAt(i)-65][1]++;
            i++;
        }

        /* for(i=0;i<26;i++){
            for(int j=0;j<2;j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        } */

        for(i=0;i<26;i++){
            if(table[i][0]!=table[i][1]){
                break;
            }
        }
        if(i!=26) return false;
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}