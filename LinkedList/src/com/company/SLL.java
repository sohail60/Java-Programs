package com.company;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
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

//    Delete duplicate elements
    public void duplicate(){
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
//      Merge two sorted Linked List
    public static Node mergeTwoLists(Node head1, Node head2) {
        LL listanswer=new LL();

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

     static class Main {
        public static void main(String args[]) {
            LL one = new LL();
            LL two = new LL();

            one.insertLast(3);
            one.insertLast(2);
            one.insertLast(0);
//            one.insertLast(2);
            one.insertLast(-4,one.head.next);

//            one.duplicate();
//            one.display();

//            two.insertLast(1);
//            two.insertLast(5);
//            two.insertLast(25);
//        two.display();

            System.out.println("Answer");
            System.out.println(one.cycleLength(one.head));
//        Node answer=mergeTwoLists(one.head, two.head);
//            System.out.println(answer.print());
        }
    }
}








