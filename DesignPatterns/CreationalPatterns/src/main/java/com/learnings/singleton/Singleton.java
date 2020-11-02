package com.learnings.singleton;

/**
 * Singleton Pattern
 * Only one object can be instantiated
 * http://www.design-patterns-stories.com/patterns/Singleton/
 * https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
 */
class Singleton {
	// singleton reference
	private static Singleton INSTANCE;

	// singleton constructor not allowing to create by any external class
	private Singleton() {

	}

	/**
	 * Lazy Instantiation
	 * Creates an instance if not existing only
	 * @return a reference to a single instance
	 */
	static Singleton getNormalInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	/**
	 * Thread safe Singleton
	 * Multi-Threaded environment can be solved using synchronised
	 * Thread safe but slow performance
	 */
	synchronized static Singleton getSynchronizedInstance1() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	/**
	 * Lazy with Double check locking
	 * synchronized block to remove performance overhead
	 * When first time it will create performance issue
	 */
	static Singleton getSynchronizedInstance2() {

		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}

	/**
	 * 	Eager way but Lazy instantiation
	 * 	STATIC INNER CLASS will provide the single instance when asked only
	 * 	Most widely used method
 	 */
	private static class BillPughSingleton {
		private static final Singleton INSTANCE = new Singleton();
	}

	static Singleton getInnerClassInstance() {
		return BillPughSingleton.INSTANCE;
	}
}
