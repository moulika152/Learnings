package com.learnings.builder;

/**
 * Declares interface for creating parts of Product object
 */
public abstract class Builder {
	public abstract Builder createProduct();

	public abstract Builder buildPart1(String part);

	public abstract Builder buildPart2(String part);
}
