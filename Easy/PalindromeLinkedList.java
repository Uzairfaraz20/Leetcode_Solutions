/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow = reversed(slow);
        fast = head;
        
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            
            slow = slow.next;
            fast = fast.next; 
        }
        
        return true;
    }
    
    
    public ListNode reversed(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
        ListNode temp = head.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        }
    return prev;
    }
}