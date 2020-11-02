package com.learnings.prototype;

/**
 * Interface defing the copyMe() method
 * http://www.design-patterns-stories.com/patterns/Prototype/
 */
abstract class Prototype implements Cloneable {
	/**
	 * Copy method
	 * @return copy of the object
	 * @throws CloneNotSupportedException
	 */
	abstract Prototype copyMe() throws CloneNotSupportedException;
}
