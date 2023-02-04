import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        String res="";
        k=k%26;
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i);
            if(x>=65 && x<=90)
            {
               if(x+k>=65 && x+k<=90) 
               {
                   res+=(char)(x+k);
               }
               else{
                   res+=(char)(x+k-26);
               }
            }
            
            else if(x>=97 && x<=122)
            {
                if(x+k>=97 && x+k<=122)
                {
                    res+=(char)(x+k);
                }
                else
                {
                    
                   res+=(char)(x+k-26);
    
                }
            }
            
            else
            {
                res+=(char)x;
            }
        }
        
        return res;
        
        
        
        
        
        
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
