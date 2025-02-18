//detect if a cycle is present in the LinkedList, if present then remove

//approach: Floyds Cycle Algorithm

//use two pointers, slow moves one step, fast moves two steps

//if they meet, the cycle exists
//to remove the cycle: start the pointer from the head
//move the pointers at the same speed until they meet at the start of the cycle
//find the last node and remove the cycle

import java.util.*;

class LN{
    int val;
    LN next;
    LN(int x){
        val=x;
        next=null;
    }
}

public class LinkedList1 {
    //will check whether a cycle is their
    public static boolean hasCycle(LN head){
        LN slow=head, fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //if the cycle is detected, we will remove it
    public static void removeCycle(LN head){
        LN slow=head, fast=head;
        boolean cycleExist=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycleExist=true;
                break;
            }
        }
        if(!cycleExist) return;
        slow=head;

        //to remove
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null; //cycle removed
    }
    public static void main(String[] args) {
        LN head=new LN(1);
        head.next=new LN(2);
        head.next.next=new LN(3);
        head.next.next.next=new LN(4);
        head.next.next.next.next=head.next; //cycle created
        System.out.println("Cycle detected: "+hasCycle(head));
        removeCycle(head);
        System.out.println("Cycle removed: "+hasCycle(head));
    }
}
