package com.cindyk.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo<T> {
	private T t; //must declare type parameter on class level first in order to use this
	public void set(T t) { this.t = t; }
	public T get() { return t; }

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Electric", "Pikachu", 5);
		Pokemon bulbasaur = new Pokemon("Leaf", "Bulbasaur", 23);
		Pokemon charmander = new Pokemon("Fire", "Charmander", 17);
		Pokemon cyndaquil = new Pokemon("Fire", "Cyndaquil", 6);
		Pokemon squirtle = new Pokemon("Water", "Squirtle", 9);

		List<Pokemon> pokemons = new ArrayList<>(Arrays.asList(pikachu, bulbasaur, charmander, squirtle, cyndaquil));

		Predicate<Pokemon> isFire = (pokemon -> pokemon.type.equals("Fire"));
		Predicate<Pokemon> levelHigherThan10 = (pokemon -> pokemon.level > 10);

		Predicate<Pokemon> predicate = pokemon ->
		 isFire.and(levelHigherThan10).test(pokemon);

		pokemons.forEach(pokemon -> System.out.println(pokemon.name));

	}
}

class Pokemon{
	final String type;
	final String name;
	final int level;

	public Pokemon(String type, String name, int level) {
		this.type = type;
		this.name = name;
		this.level = level;
	}
}
