package com.UsingArray;

public class Tester {

	public static void main(String[] args) {
		MyStack st=new MyStack(5);
		st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.peek());
		System.out.println(st.isFull());
		st.print();
	}

}
