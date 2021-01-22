package com.learnings;

import java.io.Closeable;
import java.io.IOException;

public class MyCustomResource2 implements Closeable {

	public MyCustomResource2() {
		System.out.println("Constructor ===> My Resource 2");
	}

	public void doSomeThing() {
		System.out.println("Something ==> My Resource 2");
	}

	@Override public void close() throws IOException {
		System.out.println("Auto closed ==> My Resource 2");
	}
}
