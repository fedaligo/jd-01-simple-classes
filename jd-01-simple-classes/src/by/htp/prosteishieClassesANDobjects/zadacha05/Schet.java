package by.htp.prosteishieClassesANDobjects.zadacha05;

import java.util.Scanner;

public class Schet {
Scanner sc=new Scanner(System.in);

public int SchVERX() {
	System.out.println("¬ведите значени€ начала и конца отрезка");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("введите значение из этого отрезка");
	int z=sc.nextInt();
	int count=0;
	if(y>x) {while(z>y||z<x)
		{System.out.println("¬ведите значение из диапазона: от "+x+" до "+y);
		z=sc.nextInt();}
	while(z!=y) {
		z=z+1;
		count++;}
	}
	
	else {while(z>x||z<y)
		{System.out.println("¬ведите значение из диапазона: от "+y+" до "+x);
		z=sc.nextInt();}
	while(z!=x) {
		z=z+1;
		count++;}
		}
	
	return count;
}
public int SchNIZ() {System.out.println("¬ведите значени€ начала и конца отрезка");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("введите значение из этого отрезка");int z=sc.nextInt();
int count=0;
if(y>x) {while(z>y||z<x)
	{System.out.println("¬ведите значение из диапазона: от "+x+" до "+y);
	z=sc.nextInt();}
while(z!=x) {
	z=z-1;
	count++;}
}

else {while(z>x||z<y)
	{System.out.println("¬ведите значение из диапазона: от "+y+" до "+x);
	z=sc.nextInt();}
while(z!=y) {
	z=z-1;
	count++;}
	}

return count;}
}
