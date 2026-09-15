// Problem: LeetCode 141 - Linked List Cycle
// Time Complexity: O(N) - Fast pointer traverses the list at most O(N) times.
// Space Complexity: O(1) - Only two pointers (slow and fast) are used, no extra memory.

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}