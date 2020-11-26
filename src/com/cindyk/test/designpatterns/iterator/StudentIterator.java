package com.cindyk.test.designpatterns.iterator;

import com.cindyk.test.harrypotter.Student;

import java.util.Iterator;

//concrete iterator
public class StudentIterator implements Iterator<Student> {
	Iterator<Student> iterator;

	public StudentIterator(Iterator<Student> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	@Override
	public Student next() {
		return this.iterator.next();
	}
}
