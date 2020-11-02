package com.learnings.prototype;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class PrototypeTest {

	@Test
	public void testPrototype() throws CloneNotSupportedException {
		// creates object of type Prototype
		Prototype prototype = new ConcretePrototype();

		// creates Client object(Prototype is "injected" via Constructor)
		Client client = new Client(prototype);

		// client creates new object(clone it self) of type Prototype
		Prototype clonePrototype = client.operation();

		// ensure that prototype and it's own clone are not same objects
		assertNotEquals(prototype, clonePrototype);
	}
}
