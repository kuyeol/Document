package org.acme;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        int[] test = {2, 5, 5, 11};
        int target = 10;

        int[] out = twoSum(test, target);

        for (int a : out) {
            System.out.print(a + " ");
        }

    }


    public static int[] twoSum(int[] arr, int target) {

    }
        int i = 0;
        int j = 0;
        int find = 0;
        int size = arr.length;

        int[][] newArray = new int[2][];
        int arri = 0;

        if (target != find) {
            for (i = 0; i < size; i++) {
                for (j = i + 1; j < size; j++) {
                    find = arr[i] + arr[j];
                    if (find == target) {
                        System.out.println("i = " + i + ", j = " + j);
                        newArray[arri] = new int[]{i, j};
                        arri++;
                       return newArray[0];
                    }
                }

            }
        }

        return newArray[0];
    }


}


/**
 * class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *
 *         int i = 0;
 *         int j = 0;
 *         int find = 0;
 *
 *         int size = nums.length;
 *         int[] rs = new int[] {};
 *        // Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
 *
 *          int[][] newArray = new int[nums.length][];
 *          int arri = 0;
 *
 *         for (i = 0; i < size; i++) {
 *             for (j = i + 1; j < size; j++) {
 *                 find = nums[i] + nums[j];
 *
 *                 if (find == target) {
 *                      newArray[arri] = new int[] { i , j };
 *                      arri++;
 *                   //  map.put(i, j);
 *                   //  rs = new int[] { i, map.get(i) };
 *
 *                 }
 *
 *             }
 *
 *         }
 *
 *         // return newArray[0];
 *         return rs;
 *     }
 * }
 */