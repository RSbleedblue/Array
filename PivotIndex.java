import java.util.*;
public class Solution{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int ans = PivotIndex(arr,size);
        System.out.println(ans);
    }
    public static int PivotIndex(int arr[],int n){
        int preFix[] = new int[n];
        int sufFix[] = new int[n];
        int ans = -1;
        preFix[0] = arr[0];
        sufFix[n-1] = arr[n-1];
        for(int i = 1; i < n; i++){
            preFix[i] = arr[i]+preFix[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            sufFix[i] = arr[i] + sufFix[i+1];
        }
        for(int i = 0; i < n; i++){
            if(preFix[i] == sufFix[i]){
                ans = i;
                return ans;
            }
        }
        return ans;
    }
}
