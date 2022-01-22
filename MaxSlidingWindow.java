//import java.util.*;
public class MaxSlidingWindow{

    public static void main(String[] args){
        // Given Array
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int size = 4; // Size of Window
        int result = computeMaximum(arr, size);
        System.out.println(result);
    } 

    public static int computeMaximum(int[] arr, int size){
        int maxSum = 0; //Maximum Sum Of array
        int length = arr.length-1; //Length of array
        int winSum = 0; //Sum of each window
        //If size of Window ig greater than size of array
        if(size > length){
            return -1;
        }
        //Sum of first Window
        for(int i = 0; i < size; i++){
            maxSum += arr[i];
        }
        winSum = maxSum;
        //Compute Sum of each Window
        for(int i = size; i <= length; i++){
            winSum += arr[i] - arr[i - size];
            maxSum = Math.max(winSum, maxSum);
        }
    return maxSum;
    }
}