/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // // 同时遍历l1、l2，取出当前元素小的节点。
        // ListNode result = new ListNode(-1);
        // ListNode next = result;


        // ListNode next1 = l1;
        // ListNode next2 = l2;
        // while (next1 != null && next2 != null) {
        //     if (next1.val <= next2.val) {
        //         next.next = next1;
        //         next1 = next1.next;
        //     } else {
        //         next.next = next2;
        //         next2 = next2.next;
        //     }
        //     next = next.next;
        // }

        // next.next = next1 != null ? next1 : next2;
        // return result.next;

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
