public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] result = new int[n];
        int k = 0;
        outer:
        for(int i = 0;i<n;i++){
            int currentValue = arr[i];
            boolean found = false;
            inner:
            for(int j = i+1;j<n;j++){
                if(currentValue<arr[j]){
                    result[k] = arr[j];
                    k++;
                    found = true;
                    break inner;
                }
            }
            if(!found){
                result[k] = -1;
                k++;
            }
            
        }
        return result;
    }
}
