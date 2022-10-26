package com.company;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {

    }


    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
