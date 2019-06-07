package by.htp.prosteishieClassesANDobjects.zadacha09;

import java.util.Scanner;

public class BookLogic {
Scanner sc=new Scanner(System.in);
String x;
String y;
int z;

public BookLogic() {
	System.out.println("Введите автора для поиска");
	this.x=sc.nextLine();
	System.out.println("Введите издательство для поиска");
	this.y=sc.nextLine();
	System.out.println("Введите год издания после которого необходимо искать");
	this.z=sc.nextInt();
	
}

	/*
	 * public void serchAUTOR(Book bk) { if(x.compareTo(bk.getAvtor())==0) {
	 * System.out.println(bk.getName()+" - книга, автор которой "+x);} }
	 */
public void serchAUTOR(Book bk) {
	for(int i=0;i<x.length();i++)
		{if(x.charAt(i)==bk.getAvtor().charAt(i)) {if(i==x.length()-1) {System.out.println(bk.getName()+" - книга, автор которой "+x);}}
		else {break;}
			}if(x.compareTo(bk.getName())==0) {
		}
}
public void searchIZD(Book bk) {
	if(y.compareTo(bk.getIzdat())==0) {
		System.out.println(bk.getName()+" - книга, издательство которой "+y);
	}
}
public void searchYEAR(Book bk) {
	if(bk.getYear()>z) {
		System.out.println(bk.getName()+" - книга, издана после "+z+" года");
	}
}
public String getX() {
	return x;
}
public void setX(String x) {
	this.x = x;
}
public String getY() {
	return y;
}
public void setY(String y) {
	this.y = y;
}
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
}
