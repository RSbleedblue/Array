import java.util.Arrays;

public class CarryInteger {
    static int[] carryFind(int arr[],int n) {
        int carry = n;
        int size = arr.length;
        for(int i =size-1;i>=0;i--){
            int sum = arr[i] + carry;
            arr[i] = sum%10;
            carry = sum/10;
        } 
        if(carry>0){
            int[] increementedArr = new int[size+1];
            increementedArr[0] = carry;
            for(int i = 1;i<size;i++){
                increementedArr[i] = arr[i];
            }
            return increementedArr;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {4,2,3,6,5,8,7,1,5,3,9,6};
        int increement = 8;
        int result[] = carryFind(arr,increement);
        System.out.println(Arrays.toString(result));

    }
}
