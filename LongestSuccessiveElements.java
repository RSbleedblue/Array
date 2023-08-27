import java.util.Arrays;

public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int result = 0;
        int currentElementIndex = 0;
     
        int temp =0;
            for(int i = a.length-1;i>0;i--){
                if(Math.abs(a[i]-a[i-1])==1){
                    temp+=1;
              }
                else if(a[i]==a[i-1]){
                   continue;
                }  

                else if(Math.abs(a[i]-a[i-1])!=1){
                    result = Math.max(temp,result);
                    temp = 0;
                    
                }
            }
        result = Math.max(result, temp);
        return result+1;

    }
}
