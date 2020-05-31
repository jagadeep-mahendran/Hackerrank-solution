import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
            int n=s.length();
            Map<String ,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<=n;j++)
              {
                   String t=s.substring(i,j);
                   System.out.println(t);
                    char a[]=t.toCharArray();
                    Arrays.sort(a);
                    t=String.valueOf(a);
                    if(!mp.containsKey(t))
                       mp.put(t,0);
                       mp.put(t,mp.get(t)+1);
              }
         }
            int ct=0,no=0,tmp=0;
            for(Map.Entry i:mp.entrySet())
                    {    tmp=0;
                        no=(int)i.getValue();
                        for(int j=1;j<no;j++)
                            tmp=tmp+j;
                            ct=ct+tmp;
                    }
          System.out.println(mp);
         return ct;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
