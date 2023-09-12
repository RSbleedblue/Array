import java.util.Arrays;

public class test2 {
    public static void transpose(int mattrix[][]){
        for(int i=0;i<mattrix.length;i++){
            for(int j=i;j<mattrix.length-1;j++){
                int temp = 0;
                temp = mattrix[i][j];
                mattrix[i][j] = mattrix[j][i];
                mattrix[j][i] = temp;
            }
        }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
        for(int i =0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
