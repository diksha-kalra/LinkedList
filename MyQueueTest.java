package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3NumbersWhenAddedToQueueWhenPeakedShouldPointAtFirstElement() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode<Integer> myNode = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, myNode);
	}
	
	@Test
	public void given3NumbersWhenDequeueRemoveFromTheBegining() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode<Integer> myNode = myQueue.peak();
		Assert.assertEquals(myFirstNode, myNode);
		INode<Integer> popedNode =myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, popedNode);
	}
}
