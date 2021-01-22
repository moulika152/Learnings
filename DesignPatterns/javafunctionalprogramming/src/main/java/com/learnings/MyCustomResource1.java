package com.learnings;

public class MyCustomResource1 implements AutoCloseable {
	public MyCustomResource1() {
		System.out.println("Constructor ===> My Resource 1");
	}

	public void doSomeThing() {
		System.out.println("Something ==> My Resource 1");
	}

	@Override public void close() throws Exception {
		System.out.println("Auto closed ==> My Resource 1");
	}
}
