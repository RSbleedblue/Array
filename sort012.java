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
        sort012(arr,size);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void sort012(int arr[],int n){
        int i = 0;
        int j = 0;
        int k = n-1;
        while(j <= k){
            if(arr[j] == 0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else{
                swap(arr,j,k);
                k--;
            }
        }
    }
    public static void swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
