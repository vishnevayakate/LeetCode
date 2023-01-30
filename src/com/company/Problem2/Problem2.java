package com.company.Problem2;

import java.util.Arrays;

public class Problem2 {
    public int[] runningSum(int[] nums) {
        //  int sum = 0;
        //  int i = 0;
        //  int length = 0;
        //  if (nums.length > 1000){
        //      length = 1000;
        //  }
        //  else {
        //      length = nums.length;
        //  }
        //  int[] arr = new int[length];
        // for (int j = 1; j<=length; j++){
        //      sum += nums[i];
        //      arr[i] = sum;
        //      i++;
        // }
        //  return arr;

        for(int i=1;i<nums.length;i++)  nums[i]+=nums[i-1];
        return nums;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        int[] arr = problem.runningSum(new int[] {1,3,5,7});
        System.out.println(arr.toString());

    }
}