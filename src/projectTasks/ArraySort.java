package projectTasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {

        //sort an array
        // create a method that should return an array of integers
        int[] array = new int[] { 3,12,4,67,23,14,89,5 };
//        int index= -1;
//        for (int i = 0; i <array.length; i++){
//            index = i;
//            for (int j = i ; j <= array.length-1; j++){
//                if (array[j] < array[index]){
//                    index = j;
//                }
//            }
//            int temp = array[i];
//            array[i] = array[index];
//            array[index] = temp;
//        }
//
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + ",");
//        }

       int nump[]= sortArray(array);
       System.out.println(Arrays.toString(nump));


    }

    public static int[] sortedArray(int [] array){
        int index= -1;
        for (int i = 0; i <array.length; i++){
            index = i;
            for (int j = i ; j <= array.length-1; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }


    public static int []Sort(int [] nums){
        for (int i = 0; i < nums.length; i++) {

            int temp = 0;

            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        return nums;
    }

    public static int [] nums (int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        } return arr;
    }



    // olga's solution
    public static int[]sortArray(int[]arr){
        int array = arr.length;

        for (int i = 0; i < array - 1; i++)
            for (int j = 0; j < array - i - 1; j++)
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }
}




