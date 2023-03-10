class LinkedList { 
  
    Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to get the nth node from the last of a 
       linked list */
    void printNthFromLast(int n) 
    { 
        Node main_ptr = head; 
        Node ref_ptr = head; 
  
        int count = 0; 
        if (head != null) { 
            while (count < n) { 
                if (ref_ptr == null) { 
                    System.out.println(n + " is greater than the no "
                                       + " of nodes in the list"); 
                    return; 
                } 
                ref_ptr = ref_ptr.next; 
                count++; 
            } 
            while (ref_ptr != null) { 
                main_ptr = main_ptr.next; 
                ref_ptr = ref_ptr.next; 
            } 
            System.out.println("Node no. " + n + " from last is " + 
                               main_ptr.data); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
        llist.head = new Node(1); 
        llist.head.next = new Node(2); 
        llist.head.next.next = new Node(3); 
        llist.head.next.next.next = new Node(4); 
        llist.head.next.next.next.next = new Node(5); 
  
        llist.printNthFromLast(2); 
    } 
}