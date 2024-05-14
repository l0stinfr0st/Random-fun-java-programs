
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1.next != null && temp2.next != null) {

        }
        
            ){
            if (temp1.val + temp2.val > 9) {
                int down = (temp1.val + temp2.val) % 10;
                int carry = (temp1.val + temp2.val) / 10;
            } else {
                ListNode added = new ListNode();
            }
        }
    }
}
