package com.bridgelabz.linkedlist.Node;

public class Node<K> {
	private Node next;
    private K key;

    public Node(K key) {
        this.key = null;
        this.next = null;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
