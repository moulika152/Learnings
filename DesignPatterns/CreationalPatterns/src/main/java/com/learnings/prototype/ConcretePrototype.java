package com.learnings.prototype;

/**
 * Implements Prototype interface to implement copyMe() method
 */
class ConcretePrototype extends Prototype{

	/**
	 *
	 * @return prototype object
	 * @throws CloneNotSupportedException
	 */
	Prototype copyMe() throws CloneNotSupportedException {
		return (Prototype) this.clone();
	}
}
