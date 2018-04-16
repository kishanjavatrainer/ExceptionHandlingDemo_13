package com.infotech.client;

import com.infotech.model.Hello;

public class ClientTest {

	public static void main(String[] args) {

		try {
			Class<?> cls = Class.forName("com.infotech.model.Hello");
			Object obj = cls.newInstance();
			if (obj instanceof Hello) {
				Hello hello = (Hello) obj;
				hello.greet();
			} else {
				throw new ClassCastException("Provided class type is not correct!!");
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
