package ru.otus.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> testList;
		List<Integer> testList2 = List.of(1, 3, 5, 7, 9, 11, 13);
		List<Integer> testList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		testList = createMinToMaxList(1, 15);
		System.out.println(testList);
		System.out.println(sumElements(testList2));
		replaceElements(5, testList3);
		System.out.println(testList3);
		increaseElements(5, testList3);
		System.out.println(testList3);

		Employee emp = new Employee("Test", 40);
		Employee emp2 = new Employee("Test2", 25);
		Employee emp3 = new Employee("Test3", 50);
		List<Employee> testList4 = new ArrayList<Employee>(Arrays.asList(emp, emp2, emp3));
		List<String> testListNames = getAllNames(testList4);
		System.out.println(testListNames);
		List<Employee> testList5 = checkAge(testList4, 33);
		System.out.println(testList5);
		System.out.println(checkAverageAge(testList4, 40));
		System.out.println(youngestEmployee(testList4));
	}

	public static ArrayList<Integer> createMinToMaxList(int min, int max) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			list.add(i);
		}
		return list;
	}

	public static int sumElements(List<Integer> list) {
		int sum = 0;
		for (Integer element : list) {
			if (element > 5) {
				sum += element;
			}
		}
		return sum;
	}

	public static void replaceElements(int num, List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, num);
		}
	}

	public static void increaseElements(int num, List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) + num);
		}
	}

	public static List<String> getAllNames(List<Employee> employees) {
		List<String> names = new ArrayList<>();
		for (Employee emp : employees) {
			names.add(emp.name);
		}
		return names;
	}

	public static List<Employee> checkAge(List<Employee> employees, int age) {
		List<Employee> correctAgeEmployees = new ArrayList<>();
		for (Employee emp : employees) {
			if (emp.age >= age) {
				correctAgeEmployees.add(emp);
			}
		}
		return correctAgeEmployees;
	}

	private static boolean checkAverageAge(List<Employee> employees, int averageAge) {
		int sumAge = 0;
		for (Employee emp : employees) {
			sumAge += emp.age;
		}
		return sumAge / employees.size() > averageAge;
	}

	public static Employee youngestEmployee(List<Employee> employees) {
		Employee youngest = employees.get(0);
		for (Employee emp : employees) {
			if (youngest.age > emp.age) {
				youngest = emp;
			}
		}
		return youngest;
	}
}
