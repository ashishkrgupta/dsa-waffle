package org.learning.string_arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numbs = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(numbs));

        numbs = new int[] {1,2,3,4};
        System.out.println(containsDuplicate(numbs));

        numbs = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(numbs));
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
