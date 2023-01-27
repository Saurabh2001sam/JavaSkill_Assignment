import java.util.LinkedList;

import org.w3c.dom.Node;

public class Lpalin {
    public static void main(String[] args) {
        
    }
}

    public static boolean isPalindrome(LinkedList list) {
        // Initialize two pointers
        Node slow_ptr = list.head, fast_ptr = list.head;
        Node second_half, prev_of_slow_ptr = list.head;
        Node midnode = null;
        boolean res = true;

        if (list.head != null && list.head.next != null) {
            // Get the middle of the list
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;

                // We need previous of the slow_ptr for linked lists with odd elements
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }

            // fast_ptr would become NULL when there are even elements in list
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }

            // Now reverse the second half and compare it with first half
            second_half = slow_ptr;
            prev_of_slow_ptr.next = null;
            reverse(second_half);
            res = compareLists(list.head, second_half);

            // Construct the original linked list
            reverse(second_half);

            // If there was a mid node (odd size case) which
            // was not part of either first half or second half.
            if (midnode != null) {
                prev_of_slow_ptr.next = midnode;
                midnode.next = second_half;
            } else
                prev_of_slow_ptr.next = second_half;
        }
        return res;
    }

    /*
     * Function to reverse the linked list Note that this
     * function may change the head
     */
    static void reverse(Node second_half) {
        Node prev = null;
        Node current = second_half;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second_half = prev;
    }

    /* Function to check if two input lists have same data */
static boolean compareLists(Node head1, Node head2) 
{ 
    Node temp1 = head1; 
    Node temp2 = head2; 
  
    while (temp1 != null && temp2 != null) 
    { 
        if (temp1.data == temp2.data) 
        { 
            temp1 = temp1.next; 
            temp2 = temp2.next; 
        } 
        else
            return false; 
    } 
  
    /* Both are empty reurn 1*/
    if (temp1 == null && temp2 == null) 
        return true; 
  
    /* Will reach here when one is NULL 
        and other is not */
    return false; 
}
