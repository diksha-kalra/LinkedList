package com.cg.linkedlist;

public class MyQueue<K extends Comparable<K>> {
	private final MyLinkedList<K> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}

	public void enqueu(INode<K> element) {
		myLinkedList.append(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public void printQueue() {
		myLinkedList.printMyNode();
	}
}
