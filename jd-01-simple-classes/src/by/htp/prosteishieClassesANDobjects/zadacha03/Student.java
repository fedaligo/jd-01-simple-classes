package by.htp.prosteishieClassesANDobjects.zadacha03;

import java.util.Arrays;

public class Student {
	
private String name;
public int age;
public int[]marks=new int[5];

public Student(String name,int age,int[]marks) {

	this.name=name;
	this.age=age;
	this.marks=marks;}

	/*
	 * public boolean isAStudent() { for(int mark : marks) { if(mark<9) { return
	 * false; } } return true; }
	 */

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

public int[] getMarks() {
	return marks;
}

public void setMarks(int[] marks) {
	this.marks = marks;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + Arrays.hashCode(marks);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age != other.age)
		return false;
	if (!Arrays.equals(marks, other.marks))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
	



}
