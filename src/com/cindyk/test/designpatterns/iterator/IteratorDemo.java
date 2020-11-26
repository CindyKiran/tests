package com.cindyk.test.designpatterns.iterator;

import com.cindyk.test.harrypotter.HouseDivision;
import com.cindyk.test.harrypotter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(Arrays.asList(
				new Student("Harry", "Potter", HouseDivision.GRIFFINDOR),
				new Student("Draco", "Malfoy", HouseDivision.SLYTHERIN),
				new Student("Cho", "Chang", HouseDivision.RAVENCLAW)
		));
		//Lists implements Iterable, so can make Iterator instance of it
		Iterator studentIterator = students.iterator();

		//StudentRepository is not automatic implement Iterable
		StudentRepository studentRepo = new StudentRepository(students);
		Iterator<Student> studentRepoIterator = studentRepo.iterator();

		while(studentRepoIterator.hasNext()){
			System.out.println(studentRepoIterator.next());
		}
	}
}
