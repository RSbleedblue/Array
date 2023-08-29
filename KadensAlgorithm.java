import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		int currentSum = 0;
		int maxSum=0;
		for(int i = 0;i<arr.length;i++){
			currentSum+=arr[i];
			maxSum = Math.max(currentSum, maxSum);
			if(currentSum<0){
				currentSum = 0;
			}
		}
		return maxSum;
	}
	

}
