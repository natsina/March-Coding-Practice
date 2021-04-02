/*
Given an array arr, replace every element in that array with the greatest element among the elements to
its right, and replace the last element with -1.

After doing so, return the array.

*/
class Solution {
    public int[] replaceElements(int[] A) {
        int mx = -1, n = A.length, a;
        for (int i = n - 1; i >= 0; --i) {
            a = A[i];
            A[i] = mx;
            mx = Math.max(mx, a);
        }
        return A;
    }
}