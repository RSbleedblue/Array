import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = findMax(input);
        System.out.println(result);
    }
    public static int findMax(int n){
        int freq[] = new int[10];
        int size = sizeOfNum(n);
        for(int i = 0; i < size; i++){
            int val = n%10;
            n = n/10;
            freq[val]++;
        }
        int maxVal = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < 10; i++){
            if(freq[i] > maxVal){
                maxVal = freq[i];
                ans = i;
            }
        }
        return ans;
    }
    public static int sizeOfNum(int n){
        int count = 0;
        while(n>0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
