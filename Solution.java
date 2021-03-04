//Challenge 1 and 2 for Day 2


// challenge 1

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip;
        double tax;
        double total_cost;
        tip=meal_cost*tip_percent/100;
        tax=meal_cost*tax_percent/100;
        total_cost=meal_cost+tip+tax;
        System.out.print(Math.round(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}




____________________________________________________________________________________________________________

//Challenge 2

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] results = new int[2];
        for(int i=0;i<nums.length;i++){
            
            // checking for the index of repeated number
            if((i+1)%nums[i]!=0){
                results[0]=nums[i-1];
                results[1]=nums[i-1]+1;
            }
            
        }
        return results;
    }
}
    