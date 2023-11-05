import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateK(arr,size,k);
        for(int i = 0; i < size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateK(int arr[],int n, int k){
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-k-1);
        rotate(arr,0,n-1);
    }
    public static void rotate(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
