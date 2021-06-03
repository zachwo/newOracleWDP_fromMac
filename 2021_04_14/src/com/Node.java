package com;

public class Node {
    Object item;
    Node prev;
    Node next;

    public Node() {
    }

    public Node(Node prev, Object item, Node next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }
}
