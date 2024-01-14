package com.example;

public class Person {
	String name;
	int age;

	public Person() {
		this.name = "名無し";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.println(this.name + "さんの年齢は" + this.age + "歳です。");
	}
}
