package com.cg.linkedlist;

public class MyStack<K extends Comparable<K>> {
	private final MyLinkedList<K> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(INode<K> element) {
		myLinkedList.add(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}

	public INode<K> pop() {
		return myLinkedList.pop();
	}
}
