package com.learnings.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void testAbstractFactory() {
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();

		Assert.assertEquals(ProductA1.class, factory1.createProductA().getClass());
		Assert.assertEquals(ProductB1.class, factory1.createProductB().getClass());

		Assert.assertEquals(ProductA2.class, factory2.createProductA().getClass());
		Assert.assertEquals(ProductB2.class, factory2.createProductB().getClass());

	}
}
