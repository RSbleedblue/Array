import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static int findMinNumbers(ArrayList<Integer> arr, int sum, int maxVal) 
	{
		// Write your code here.
		int checkSum = 0;
		for(int num: arr){
			checkSum+=num;
		}
		if(checkSum == sum){
			return 0;
		}
		int count = 0;
		int difference  = sum - checkSum;
		int rem  = Math.abs(difference%maxVal);
		int quo = Math.abs(difference/maxVal);
		if(rem==0){
			count = quo;
			return count;
		}
		else{
			count = quo;
			return count+1;
		}
	}
}

