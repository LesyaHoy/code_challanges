/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result, currentNode;
        result = currentNode= null;
        int prevStepVal = 0;

        while(l1 != null || l2 != null){
            int l1value, l2value;
            l1value = l2value = 0;
            if(l1 != null){
                l1value = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                l2value = l2.val;
                l2 = l2.next;
            }

            int currentValue = l1value + l2value + prevStepVal;
            if(currentValue - 10 >= 0){
                currentValue = currentValue - 10;
                prevStepVal = 1;
            }
            else{
                prevStepVal = 0;
            }

            if(result == null){
                currentNode = result = new ListNode(currentValue);
            }
            else{
                ListNode next = new ListNode(currentValue);
                currentNode.next = next;
                currentNode = currentNode.next;
            }
        }
        if(prevStepVal > 0){
             ListNode next = new ListNode(prevStepVal);
             currentNode.next = next;
        }

        return result;
    }
}