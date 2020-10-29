package com.cindyk.test;

public class Demo<T> {
	private T t; //must declare type parameter on class level first in order to use this
	public void set(T t) { this.t = t; }
	public T get() { return t; }
}
