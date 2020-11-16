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
		Assert.assertEquals(ConcreteProductA.class, productA.getClass());
		Assert.assertEquals(ConcreteProductB.class, productB.getClass());
	}
}
