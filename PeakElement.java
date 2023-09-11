import java.util.ArrayList;

public class PeakElements {
    public static ArrayList<Integer> peak(int arr[]){
        if(arr.length<2){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(Math.max(arr[1],arr[0]));
            return ans;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[arr.length-1]);
            return ans;
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            int start = i;
            int middle = start+1;
            int end = middle+1;
            if(i<arr.length-2 && (arr[middle]>arr[start] && arr[middle] > arr[end])){
                ans.add(arr[middle]);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]  = {10,20,30,40,50};
        ArrayList<Integer> ans = peak(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
