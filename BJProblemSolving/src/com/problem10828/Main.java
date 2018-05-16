package com.problem10828;

import java.util.Scanner;

public class Main {
	private static Node top = null;
	private static int size;
	
	private static class Node {
		private int data;
		private Node nextNode;

		Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public static int empty() {
		if (top == null)
			return 1;
		else
			return 0;
	}

	public static void push(int item){
        
        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;
        size++;
    }
	
	public static int top() {
		if(top == null) return -1;
		else return top.data;
	}
	
	public static int pop() {
		if(top == null) {
			return -1;
		}
		int item = top.data;
		top = top.nextNode;
		size--;
		return item;
	}
	
	public static int size() {
		return size;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			String tmp = sc.next();
			switch(tmp) {
			case "push":
				int p_tmp = sc.nextInt();
				push(p_tmp);
				break;
			case "pop":
				System.out.println(pop());
				break;
			case "size":
				System.out.println(size());
				break;
			case "empty":
				System.out.println(empty());
				break;
			case "top":
				System.out.println(top());
				break;
			}
		}
	}
}
