package com.company;

import java.util.LinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }

    public class Node{
        private int value;
        private Node next;

    public Node(int value){
        this.value=value;
    }

    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }

    public int print(){
        return value;
    }
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertLast(int value,Node after){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        node.next=after;
        size++;
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size){
            insertLast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
    }

    public int deleteFirst(){
        int value= head.value;;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int value= tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;
        size--;
        return value;
    }

    public Node find(int value){
        Node node=head;

        while (node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void display(){
     Node temp=head;
     while (temp!=null){
         System.out.print(temp.value + "->");
         temp=temp.next;
     }
     System.out.println("END");
    }

//    Questions:

//    Q1: Inserting via Recursion
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }

    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }

//   Q2: Delete duplicate elements
    public void removeDuplicate(){
        Node node=head;

        while(node.next!=null){
            if (node.value==node.next.value){
                node.next=node.next.next;
            } else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

//   Q3: Merge two sorted Linked List
    public static Node mergeTwoLists(Node head1, Node head2) {
        SLL listanswer=new SLL();

        while (head1!=null && head2!=null){
            if(head1.value>=head2.value){
                listanswer.insertLast(head2.value);
                head2=head2.next;
            } else{
                listanswer.insertLast(head1.value);
                head1=head1.next;
            }
        }
        while (head1!= null){
            listanswer.insertLast(head1.value);
            head1=head1.next;
        }

        while (head2!= null){
            listanswer.insertLast(head2.value);
            head2=head2.next;
        }
        listanswer.display();
        return listanswer.head;
    }

//    Q4: Determine whether Linked List has a cycle
    public boolean hasCycle(Node head) {
        boolean flag=false;
        if(head==null){
            return false;
        }
        Node slow=head;
        Node fast=head;

        slow=slow.next;

        if(fast.next!=null){
            fast=fast.next.next;
        }

        while(slow != null && fast!= null){
            if(slow == fast){
                flag=true;
                break;
            }
            slow=slow.next;
            if(fast.next!=null){
                fast=fast.next.next;
            } else {
                break;
            }
        }
        return flag;
    }

//    Q5: Length of Linked List cycle
    public int cycleLength(Node head) {
        int counter=0;
        if(head==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;

        while(fast!= null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow == fast) {
                Node temp=slow;
                do {
                    temp=temp.next;
                    counter++;
                } while(temp != fast);
                return counter;
            }
            }
        return counter;
    }

    //    Q5: Return the starting Node of the cycle in the LL
    public Node startCycle(Node head){
        int length=cycleLength(head);

        if (length==0){
            return null;
        }

        Node first=head;
        Node second=head;

        for (int i = 0; i < length; i++) {
            second=second.next;
        }

        while (first!=null){
            if (first==second){
                return first;
            }
            first=first.next;
            second=second.next;
        }
        return null;
    }

//    Q6: Determine whether a number is a happy number or not
//    Done in Leetcode Package. Question no. 202


//    Q7: Find the middle of a LL
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

//    Q8: Sort a LL via Merge Sort

//    Q9: Sort a LL via Bubble Sort

//    Q10: Reverse a Linked List via Recursion
    public Node reverseRec(Node head){
        if(head.next==null){
            return head;
        }
        Node temp=head.next;

        Node lastcall=reverseRec(temp);
        lastcall.next=temp;
        tail=temp;
        temp.next=null;

        return temp;
    }

    //    Q11: Reverse a Linked List via Iteration
    public static Node reverseItn(Node head){
        if (head == null) {
            return head;
        }

        Node previous=null;
        Node present=head;
        Node after=head.next;

        while (present!=null){
            present.next=previous;
            previous=present;
            present=after;
            if (after!=null){
            after=after.next;
            }
        }
        head=previous;

        return head;
    }

//    Q12: Reverse a part of LL
    public Node reverseParts(Node head,int left,int right){
        if (left==right){
            return head;
        }

        Node present=head;
        Node previous=null;
        for (int i = 0; i < left-1 && present!=null; i++) {
            previous = present;
            present=present.next;
        }

        Node last=previous;
        Node newEnd=present;
        Node after=present.next;

        for (int i = 0; i < right-left+1 && present!=null; i++) {
            present.next=previous;
            previous=present;
            present=after;
            if (after!=null){
                after=after.next;
            }
        }

        if (last!=null){
            last.next=previous;
        } else {
            head = previous;
        }
        newEnd.next=present;

        return head;
    }

//    Q13: Determine whether a LL is palindrome or not
    public boolean isPalindrome(Node head){
        boolean flag=true;

        if(head.next==null){
            return flag;
        }

        int length=0;
        Node temp=head;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        int mid=(length/2)+1;
        Node reversed=reverseParts(head,mid+1,length);

        Node startNode=head;
        Node middleNode=middle(head);
        int i=1;

        while (i<=mid && middleNode!=null){
            if(startNode!=middleNode){
                flag=false;
                break;
            }
            startNode=startNode.next;
            middleNode=middleNode.next;
        }
        return flag;
    }

//    Q13: Reorder a LL
    public static void reorderList(Node head){
        if(head==null || head.next==null){
            return;
        }

        Node mid=middle(head);

        Node head1=head;
        Node head2=reverseItn(mid);

        while(head1!=null && head2!=null){
            Node temp1=head1.next;
            Node temp2=head2.next;
            head1.next=head2;
            head2.next=temp1;
            head1=temp1;
            head2=temp2;
        }

        if(head1!=null){
            head1.next=null;
        }
    }

//    Q14: Rotate Linked List
    public static Node rotate(Node head, int k){
        if(head==null || head.next==null){
            return head;
        }

        int size=1;
        Node sizetemp=head;

        while (sizetemp.next!=null){
            sizetemp=sizetemp.next;
            size++;
        }

        k=k%size;

        int i=0;
        while (i<k){
            Node temp=head;
            Node newLast=head;

            while (newLast.next.next!=null){
                newLast=newLast.next;
            }

            temp.next=head;
            head=temp;
            newLast.next=null;
            i++;
        }
        return head;
    }
    }