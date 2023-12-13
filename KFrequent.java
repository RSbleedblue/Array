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
        int k = sc.nextInt();
        kFrequentChar(arr,size,k);
    }
    public static void kFrequentChar(int arr[],int n,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            else{
                return b[1] - a[1];
            }
        });
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            int temp[] = new int[2];
            temp[0] = key;
            temp[1] = val;
            pq.add(temp);
        }
        for(int i = 0; i < k;i++){
            int temp[] = pq.poll();
            System.out.print(temp[0]+" ");
        }
    }
}
