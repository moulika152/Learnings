package com.learnings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		// < Java 7
		Scanner oldScanner = null;
		try {
			oldScanner = new Scanner(new File("test.txt"));
			while (oldScanner.hasNext()) {
				System.out.println(oldScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (oldScanner != null) {
				oldScanner.close();
			}
		}
		// >= Java 7
		// try-with resources with single resource
		try (Scanner newScanner = new Scanner(new File("test.txt"))) {
			while (newScanner.hasNext()) {
				System.out.println(newScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// try-with resources with multiple resources
		try (Scanner anotherScanner = new Scanner(
				new File("test.txt"));
				PrintWriter writer = new PrintWriter(new File("writer.txt"))) {
			while (anotherScanner.hasNext()) {
				writer.println(anotherScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Order of the closing Resources
		orderOfClosingResources();

		// >= Java 9
		// Effectively final with the try-with resources
		/*final Scanner finalScanner = new Scanner(
				new File("test.txt"));
		PrintWriter printWriter = new PrintWriter(new File("testWrite.txt"));
		try (finalScanner; printWriter) {
			while (finalScanner.hasNext()) {
				printWriter.println(finalScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/

	}

	private static void orderOfClosingResources() {
		try (MyCustomResource1 resource1 = new MyCustomResource1(); MyCustomResource2 resource2 = new MyCustomResource2()) {
			resource1.doSomeThing();
			resource2.doSomeThing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
