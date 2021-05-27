/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.HashMap;

/**
 *
 * @author vshew
 */
public class Lab8TwoAlgorithms {
    
    private int [] arrayOfInts;
    private int targetNumber;
    
    private int [] firstResult;
    private int [] secondResult;

    
    public int[] getArrayOfInts() {
        return arrayOfInts;
    }

    public void setArrayOfInts(int[] arrayOfInts) {
        this.arrayOfInts = arrayOfInts;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int[] getFirstResult(int[] nums, int target) {
        if (nums.length < 2) return null;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public void setFirstResult(int[] firstResult) {
        this.firstResult = firstResult;
    }

    public int[] getSecondResult(int[] nums, int target) {
        if (nums.length < 2) return null;
        HashMap<Integer, Integer> map = new HashMap();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if (map.containsKey(temp))
                return new int[]{map.get(temp), i};
            map.put(nums[i], i);
        }
        return null;
    }

    public void setSecondResult(int[] secondResult) {
        this.secondResult = secondResult;
    }

    
    
}
