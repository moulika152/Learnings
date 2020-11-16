package com.learnings.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
	@Test
	public void testBuilder() {
		ConcreteBuilder builder = new ConcreteBuilder();

		Director director = new Director(builder);
		director.construct();
		Product product = builder.getResult();

		Assert.assertEquals(product.getPart1(), "part1");
		Assert.assertEquals(product.getPart2(), "part2");
	}
}
