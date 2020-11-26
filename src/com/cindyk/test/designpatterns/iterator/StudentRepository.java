package com.cindyk.test.designpatterns.iterator;

import com.cindyk.test.harrypotter.Student;

import java.util.Iterator;
import java.util.List;

//concreteAggregate
public class StudentRepository implements Iterable<Student> {
	private final List<Student> students;
	Iterator<Student> studentIterator;

	public StudentRepository(List<Student> students) {
		this.students = students;
		this.studentIterator = students.iterator();
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(studentIterator);
	}
}
