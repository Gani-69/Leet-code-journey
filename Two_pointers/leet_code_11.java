// Problem: LeetCode 11 - Container With Most Water
// Time Complexity: O(N) - We process each line once by moving the left or right pointer.
// Space Complexity: O(1) - We only use a few integer variables.

class Solution {
    public int maxArea(int[] height) {
        int l = 0, maxwater = 0;
        int r = height.length - 1;
        while(l < r) {
            int width = r - l;
            int h = (height[l] < height[r]) ? height[l] : height[r];
            int area = width * h;
            if (area > maxwater) {
                maxwater = area;
            }
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return maxwater;
    }
}