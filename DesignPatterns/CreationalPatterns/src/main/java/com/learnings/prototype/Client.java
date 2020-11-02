package com.learnings.prototype;

/**
 * Creating a new object by asking Prototype to clone itself
 */
class Client {
	private Prototype prototype;
	Client(Prototype prototype) {
		this.prototype = prototype;
	}

	Prototype operation() throws CloneNotSupportedException {
		return prototype.copyMe();
	}
}
