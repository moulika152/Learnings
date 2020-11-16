package com.learnings.builder;

/**
 * Implements the Builder interface and constructs, assemble the parts of Product
 */
public class ConcreteBuilder extends Builder {
	private Product product;

	public Builder createProduct() {
		this.product = new Product();
		return this;
	}

	public Builder buildPart1(String part) {
		product.setPart1(part);
		return this;
	}

	public Builder buildPart2(String part) {
		product.setPart2(part);
		return this;
	}

	Product getResult() {
		return product;
	}
}
