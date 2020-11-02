package com.learnings.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

	@Test
	public void testNormalSingleton() {
		// invokes first time and object will be created
		Singleton singleton = Singleton.getNormalInstance();
		assertNotNull(singleton);

		// invokes second instance but the above object reference will be only returned
		Singleton secondSingleton = Singleton.getNormalInstance();
		// the both objects will be equal
		assertEquals(singleton, secondSingleton);
	}

	@Test
	public void testSynchronisedSingleton1() {
		Singleton singleton = Singleton.getSynchronizedInstance1();
		assertNotNull(singleton);

		Singleton secondSingleton = Singleton.getSynchronizedInstance1();
		assertEquals(singleton, secondSingleton);
	}

	@Test
	public void testSynchronisedSingleton2() {
		Singleton singleton = Singleton.getSynchronizedInstance2();
		assertNotNull(singleton);

		Singleton secondSingleton = Singleton.getSynchronizedInstance2();
		assertEquals(singleton, secondSingleton);
	}

	@Test
	public void testBillPughSingleton() {
		Singleton singleton = Singleton.getInnerClassInstance();
		assertNotNull(singleton);

		Singleton secondSingleton = Singleton.getInnerClassInstance();
		assertEquals(singleton, secondSingleton);
	}
}
