package ru.otus.lesson15;

public class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "{Name: " + name + ",Age: " + age + "}";
	}
}
