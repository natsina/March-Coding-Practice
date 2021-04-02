/*
PROBLEM DESCRIPTION
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.
*/


class Solution {
    public void duplicateZeros(int[] arr) {
        int countZeros = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) countZeros += 1;   
        }
         int i = arr.length - 1;
         int j = arr.length + countZeros - 1;
        
        while(i != j){
            insert(arr, i, j--);
            if(arr[i] == 0){
                insert(arr, i, j--);
            }
            i--;
        }
    }
    private void insert(int[] arr, int i, int j){
        if(j < arr.length){
            arr[j] = arr[i];
        }
    }
}