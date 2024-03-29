import java.util.*;

public class LL_with_reverse {
    private int size;

    LL_with_reverse() {
        size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deletFirst() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletLast() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        size--;
        if (head.next == null)
            head = null;
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int calcsize() {
        return size;
    }

    public void reverselist() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverselist_with_recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverselist_with_recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node remove_nth_fromlast(Node head, int t, int n) {
        if (head.next == null) {
            return null;
        }
        Node currNode = head;
        int size = t;
        if (n == size) {
            return head.next;
        }
        int indexTosearch = size - n;
        int i = 1;
        while (i < indexTosearch) {
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
        return head;
    }

    public static void main(String args[]) {
        LL_with_reverse list = new LL_with_reverse();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("q");
        list.addLast("m");
        list.addLast("o");
        list.addLast("x");
        int size = list.calcsize();
        list.printList();
        // list.reverselist();
        // list.printList();
        // list.head = list.reverselist_with_recursion(list.head);
        // list.printList();
        list.head = list.remove_nth_fromlast(list.head, size, 2);
        list.printList();
    }
}
