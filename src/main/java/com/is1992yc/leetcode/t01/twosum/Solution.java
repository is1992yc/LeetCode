package com.is1992yc.leetcode.t01.twosum;

import java.util.HashMap;

/**
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 *
 * @author yican
 */
public class Solution {

    /**
     * 暴力破解, 循环两次
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i=0 ; i<nums.length ; i++){
            for (int j= 0 ; j<nums.length ; j++){
                if (i != j && (nums[i] + nums[j] == target)){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 利用hashmap
     *
     * 执行用时 :2 ms, 在所有 Java 提交中击败了99.65%的用户
     * 内存消耗 :39.8 MB, 在所有 Java 提交中击败了5.06%的用户
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int stepValue;
        for (int i=0; i < nums.length ; i++){
            stepValue = target - nums[i];
            if (hash.containsKey(stepValue)){
                return new int[]{hash.get(stepValue),i};
            }
            hash.put(nums[i],i);
        }
        return null;
    }

}
