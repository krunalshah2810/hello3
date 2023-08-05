/**
 * 
 */
package com.marlabs.demo;

import java.util.Date;

/**
 * @author Nanda
 *
 */
public class Test {
	public String getData() {
		return "Hello: " + new Date().toString();
	}

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getData());
	}
}


