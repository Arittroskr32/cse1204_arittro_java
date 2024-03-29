import java.util.*;

public class LL {
    private int size;

    LL() {
        size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("q");
        list.addLast("m");
        list.addLast("o");
        list.addLast("x");
        list.printList();
    }
}