import java.util.*;

public class MedianArray {
    public static void main(String[] args){
        int arr1[] = {2, 3, 5, 8};// 1st Array
        int arr2[] = {10, 12, 14, 16, 18, 20};// 2nd Array
        int[] arr3 = merge(arr1, arr2);// Merge above 2 Arrays
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i] +" ");//Resultant Array After Merging
        }
        System.out.println();
        int result = computeMedian(arr3); //Calculate Median 
        System.out.println(result);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int length1 = arr1.length; //Length of 1st Array 
        int length2 = arr2.length;//Length of 2nd Array
        int[] arr3 = new int[length1 + length2];// Size of 3rd Array
        int idx = 0;// Index of 3rd Array
        //Merging of 1st Array in 3rd Array
        for(int i=0; i<length1; i++){
            arr3[idx] = arr1[i];
            idx++;
        }
        //Merging of 2nd Array in 3rd Array
        for(int i=0; i<length2; i++){
            arr3[idx] = arr2[i];
            idx++;
        }
        //Sorting of 3rd Array
        Arrays.sort(arr3);
        return arr3;
    } 

    public static int computeMedian(int[] arr){
        //Length of Array
        int length = arr.length;

        //If Length is Even
        if(length % 2 == 0){
            int mid = length / 2;// Middle Pointer of Array
            int midElement1 = arr[mid];
            int midElement2 = arr[mid-1];
            //Calculating median
            int ans = (midElement1 + midElement2) / 2; 
            return ans;
        }
        //If Length is Odd
        else{
            int mid = Math.round(length / 2);//Middle Pointer of Array
            //Calculating median
            int ans = arr[mid];
            return ans;
        }
    }
}
