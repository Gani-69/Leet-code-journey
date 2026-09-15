// Problem: LeetCode 287 - Find the Duplicate Number
// Time Complexity: O(N) - Floyd's cycle detection runs in linear time.
// Space Complexity: O(1) - Array is not modified and no extra data structures are used.

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point of the two runners.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the "entrance" to the cycle.
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}