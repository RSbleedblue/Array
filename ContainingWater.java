import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maxAreaContainer(ArrayList<Integer> arr) {
		// Write your code here.
		int left = 0;
		int right = arr.size()-1;
		int maxArea = 0;
		while(left<right){
			int width = right-left;
			int minHeight = Math.min(arr.get(left),arr.get(right));
			int area = width * minHeight;
			maxArea = Math.max(area, maxArea);
			if(arr.get(left)<arr.get(right)){
				left++;
			}
			else{
				right--;
			}
		}
		return maxArea;
	}
}
