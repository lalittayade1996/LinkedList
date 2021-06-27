package com.bridgelabz.linkedlist.Node;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {
	 @Test
	    public void Given3Numbers_WhenLinked_ShouldPassed_LinkedListTest() {
	        Node<Integer> firstNode = new Node<Integer>(56);
	        Node<Integer> secondNode = new Node<Integer>(30);
	        Node<Integer> thirdNode = new Node<Integer>(70);
	        firstNode.setNext(secondNode);
	        secondNode.setNext(thirdNode);
	        boolean res = firstNode.getNext().equals(secondNode) &&
	                secondNode.getNext().equals(thirdNode);
	        Assert.assertTrue(res);
	    }
}
