package bank;

import java.util.*;

public class main1 {
    private int size;
    Node head;

    main1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(String data) {
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
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist() {
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

    public int getSize() {
        return size;
    }

    public void reverselist() {
        if (head == null || head.next == null)
            return;
        Node prevnode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevnode;

            prevnode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevnode;
    }

    public static void main(String[] args) {
        main1 list = new main1();
        list.addfirst("a");
        list.addfirst("b");
        list.addLast("q");
        list.printlist();
        list.reverselist();
        list.printlist();

    }
}
