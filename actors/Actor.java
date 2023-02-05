package com.example.Celebrity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor_details")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String gender;
	private int movies;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMovies() {
		return movies;
	}
	public void setMovies(int movies) {
		this.movies = movies;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Actor(int id, String name, int age, String gender, int movies, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.movies = movies;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", movies=" + movies
				+ ", salary=" + salary + "]";
	}
	
}
