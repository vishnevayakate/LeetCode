package com.company.Problem5;

class Problem5 {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int i = 0;
        while (curr!= null) {
            curr = curr.next;
            i++;
        }

        int y = i/2 + 1;
        i = 1;
        while (i <  y) {
            head = head.next;
            i++;
        }

        return head;
    }
}

//    public ListNode middleNode(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode slow=head,fast=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//    }

class ListNode {
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
