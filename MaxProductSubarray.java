import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxProduct(arr,size);
        System.out.println(ans);
    }
    public static int maxProduct(int arr[],int n){
        int prefix = 1;
        int suffix = 1;
        int maxP = 1;
        for(int i = 0; i < n; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = arr[i] * prefix;
            suffix = arr[n - i - 1] * suffix;
            maxP = Math.max(maxP,Math.max(prefix,suffix));
        }
        return maxP;
    }
}
