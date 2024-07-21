// Java program to merge two sorted linked lists

/* Link list node */
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class MergeTwoLinkedList {
    Node head;

    /* Method to insert a node at
       the end of the linked list */
    public void addToTheLast(Node node)
    {
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String args[])
    {
        /* Let us create two sorted linked
           lists to test the methods
           Created lists:
               llist1: 3->8->5->12,
               llist2: 15->1->6->19
        */
        MergeTwoLinkedList llist1 = new MergeTwoLinkedList();
        MergeTwoLinkedList llist2 = new MergeTwoLinkedList();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new Node(3));
        llist1.addToTheLast(new Node(8));
        llist1.addToTheLast(new Node(5));
        llist1.addToTheLast(new Node(12));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new Node(15));
        llist2.addToTheLast(new Node(1));
        llist2.addToTheLast(new Node(6));
        llist2.addToTheLast(new Node(19));

        llist1.head = new Merge().sortedMerge(llist1.head,
                llist2.head);
        System.out.println("Merged Linked List is:");
        llist1.printList();
    }
}
 class Merge {
     /* Takes two lists sorted in
     increasing order, and splices
     their nodes together to make
     one big sorted list which is
     returned. */
     Node sortedMerge(Node headA, Node headB) {

        /* a dummy first node to
           hang the result on */
         Node dummyNode = new Node(0);

        /* tail points to the
        last result node */
         Node tail = dummyNode;
         while (true) {

            /* if either list runs out,
            use the other list */
             if (headA == null) {
                 tail.next = headB;
                 break;
             }
             if (headB == null) {
                 tail.next = headA;
                 break;
             }

            /* Compare the data of the two
            lists whichever lists' data is
            smaller, append it into tail and
            advance the head to the next Node
            */
             if (headA.data <= headB.data) {
                 tail.next = headA;
                 headA = headA.next;
             } else {
                 tail.next = headB;
                 headB = headB.next;
             }

             /* Advance the tail */
             tail = tail.next;
         }
         return dummyNode.next;
     }
 }

