package org.learning.string_arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numbs = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(numbs));
        System.out.println("in O(n) complexity " + containsDuplicateBySet(numbs));

        numbs = new int[] {1,2,3,4};
        System.out.println(containsDuplicate(numbs));
        System.out.println("in O(n) complexity " + containsDuplicateBySet(numbs));

        numbs = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(numbs));
        System.out.println("in O(n) complexity " + containsDuplicateBySet(numbs));
    }

    public static boolean containsDuplicate(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i+1; j < numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // solves in O(n) complexity

    /**
     * Runtime: 11 ms, faster than 70.29% of Java online submissions for Contains Duplicate.
     * Memory Usage: 67.9 MB, less than 80.74% of Java online submissions for Contains Duplicate.
     * @param numbs
     *  the array of numbers
     * @return
     *  true if it contains duplicate, false otherwise
     */
    public static boolean containsDuplicateBySet(int[] numbs) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i : numbs) {
            if ( !numberSet.add(i) ) {
                return true;
            }
        }
        return false;
    }
}
