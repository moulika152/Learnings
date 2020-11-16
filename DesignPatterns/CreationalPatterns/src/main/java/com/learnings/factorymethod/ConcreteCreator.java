package com.learnings.factorymethod;

/**
 * returns the instance of ConcreteProduct
 */
public class ConcreteCreator extends Creator {

	Product factoryMethod(String type) {
		if (type.equals("A")) {
			return new ConcreteProductA();
		} else if (type.equals("B")) {
			return new ConcreteProductB();
		}
		return null;
	}
}
