package com;

public class MyLinkList {
    int size;
    Node first;
    Node last;

    public void add(Object o){
        Node l = last;
        Node n = new Node(l,o,null);
        last = n;
        if (l == null){
            first = n; 
        }else {
            l.next = n;
        }
        size++;
    }
}
