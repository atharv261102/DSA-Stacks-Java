package com.UsingArray;

public class MyStack implements Stack{
	int top;
	int size;
	int arr[];
	MyStack(int size){
		this.top=-1;
		this.size=size;
		arr=new int[size];
	}
	@Override
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		top+=1;
		arr[top]=x;
	}

	@Override
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		}
		top-=1;
		return;
	}

	@Override
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return arr[top];
	}

	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public boolean isFull() {
		return top==arr.length-1;
	}

	@Override
	public void print() {
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
