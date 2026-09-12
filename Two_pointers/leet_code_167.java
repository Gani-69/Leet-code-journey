// Problem: LeetCode 167 - Two Sum II (Input Array Is Sorted)
// Time Complexity: O(N) - We traverse the array at most once using two pointers.
// Space Complexity: O(1) - No extra space used, only a few variables.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, sum = 0;
        int r = numbers.length - 1;
        while (l < r) {
            sum = numbers[l] + numbers[r];
            if (sum == target) {
             return  new int[]{l + 1, r + 1};
            }
            else if (sum < target) {
                l++;
            }   
            else {
                r--;
            }
        }
        return new int[]{};
    }
}