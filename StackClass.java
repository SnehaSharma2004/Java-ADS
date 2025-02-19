import java.util.*;
import java.io.*;

public class StackClass {
    /*what is stack?
     * stack is a linear data structure that follows LIFO (Last In First Out) principle.
     * meaning the last element added is the first one which is removed first
     * operations: push and pop, peek, isEmpty, size
     * insertion and deletion from one end only     */
    public static void main(String[] args) {
        Stack<Object> n=new Stack<>();
        n.push(1);
        n.push(2);
        n.push("sneha");
        n.push(23.456);
        System.out.println(n);
        System.out.println(n.peek());
        n.pop();
        System.out.println(n);
        System.out.println(n.isEmpty());
        n.pop();
        n.pop();
        System.out.println(n.isEmpty());
        System.out.println(n.size());

    }
}
