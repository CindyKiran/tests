package com.cindyk.test;

import java.util.AbstractList;

//AbstractList is parent of ArrayList
class CustomArrayList<T> extends AbstractList<T> {
	private Object[] values;

	public CustomArrayList() {
		this.values = new Object[0];
		//this.values = new T[0]
	}

	public boolean add(T o){
		Object[] newValues = new Object[size() +1];
		for(int i = 0; i < size(); i++){
			newValues[i] = values[i];
		}
		newValues[size()] = o;
		values = newValues;

		return true;
	}

	@Override
	public T get(int index) {
		return (T)values[index]; //cast to T
	}

	@Override
	public int size() {
		return values.length;
	}
}
