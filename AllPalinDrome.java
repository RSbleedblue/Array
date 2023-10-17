import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] getPalindromes(int n) {
		
		// Write your code here
		ArrayList<Integer> list =  new ArrayList<>();
		for(int i = 1;i<=n;i++){
			if(isPalindrome(i)){
				list.add(i);
			}
			else{
				continue;
			}
		}
		int result[] = new int[list.size()];
		for(int i =0;i<list.size();i++){
			result[i] = list.get(i);
		}
		return result;

	}
	private static boolean isPalindrome(int n){
		String s = Integer.toString(n);
		int left = 0;
		int right = s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
