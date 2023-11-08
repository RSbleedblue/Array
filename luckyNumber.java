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
        int result = luckyNum(arr,size);
        System.out.println(result);
    }
    public static int luckyNum(int arr[],int size){
        int freq[] = new int[10];
        for(int i = 0; i < size; i++){
            int currentEle = arr[i];
            freq[currentEle-1]++; 
        }
        int result = -1;
      
        for(int i = 0; i < 10; i++){
            int currentVal = i+1;
            if(freq[i] == currentVal){
                result = Math.max(currentVal,result);
            }
        }
        return result;
    }
}
