package com.learnings.builder;

/**
 * Constructs an object using Builder interface
 */
class Director {
	private Builder builder;

	Director(Builder builder) {
		this.builder = builder;
	}

	void construct() {
		builder.createProduct().buildPart1("part1").buildPart2("part2");
	}
}
