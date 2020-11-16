package com.learnings.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {
	@Test
	public void testFactoryMethod() {
		Creator factory = new ConcreteCreator();
		Product productA = factory.factoryMethod("A");
		Product productB = factory.factoryMethod("B");

		Assert.assertNull(factory.factoryMethod(""));
		Assert.assertEquals("com.learnings.factorymethod.ConcreteProductA", productA.getClass().getName());
		Assert.assertEquals("com.learnings.factorymethod.ConcreteProductB", productB.getClass().getName());
	}
}
