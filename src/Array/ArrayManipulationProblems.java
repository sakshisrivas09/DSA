package Array;

public class ArrayManipulationProblems {
     static void reverseArray(int[] arr){
         int n = arr.length;
         int i  = 0;
         int j = n-1;
         while(i<=j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;


         }
         for(int k : arr){
             System.out.println(k);

         }

     }
     public static void main(String[] args) {
         int[] arr = { 2,8,9,10,11};
         reverseArray(arr);

    }
}
