import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
          int tmp[]=arr.clone();
          int sw[]=arr.clone();
          int rv[]=arr.clone();
          int n=arr.length;
          Arrays.sort(tmp);
          int x=0,y=0;
           if(Arrays.equals(tmp,arr))
              {
                  System.out.println("yes");
                  return ;
              }
           for(int i=0;i<n;i++)
              {
                  if(tmp[i]!=arr[i]){
                     x=i;
                     break;
                  }
              }
              for(int i=n-1;i>=0;i--)
              {
                  if(tmp[i]!=arr[i]){
                     y=i;
                     break;
                  }
              }
                 int t=sw[x];
                 sw[x]=sw[y];
                 sw[y]=t;
                 if(Arrays.equals(tmp,sw))
                    {
                        System.out.println("yes");
                        System.out.println("swap "+(x+1)+" "+(y+1));
                        return ;
                    }
                     int p=x;
                   for(int i=y;i>=x;i--)
                       {
                          rv[p]=arr[i];
                          p++;
                       }
                 if(Arrays.equals(tmp,rv))
                    {
                        System.out.println("yes");
                        System.out.println("reverse "+(x+1)+" "+(y+1));
                        return ;
                    }
                    else
                     {
                         System.out.println("no");
                     }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}
