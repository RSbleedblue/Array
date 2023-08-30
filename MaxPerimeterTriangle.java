import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        // Write your code here.
         Collections.sort(arr);
            ArrayList<ArrayList<Integer>> set = new ArrayList<>();
            for(int i = 0;i<arr.size()-2;i++){
                ArrayList<Integer> list = new ArrayList<>();
                if(arr.get(i)+arr.get(i+1)>arr.get(i+2)){
                    list.add(arr.get(i));
                    list.add(arr.get(i+1));
                    list.add(arr.get(i+2));
                }
                set.add(list);
        }
            int maxSum = 0;
            for(ArrayList<Integer> traingle : set ){
                int temp = 0;
                for(int i = 0;i<traingle.size();i++){
                    temp+=traingle.get(i);
                }
                maxSum = Math.max(temp,maxSum);
            }
            return maxSum;
    }
}
