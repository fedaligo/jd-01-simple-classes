package by.htp.prosteishieClassesANDobjects.zadacha05;

import java.util.Scanner;

public class Schet {
Scanner sc=new Scanner(System.in);

public int SchVERX() {
	System.out.println("������� �������� ������ � ����� �������");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("������� �������� �� ����� �������");
	int z=sc.nextInt();
	int count=0;
	if(y>x) {while(z>y||z<x)
		{System.out.println("������� �������� �� ���������: �� "+x+" �� "+y);
		z=sc.nextInt();}
	while(z!=y) {
		z=z+1;
		count++;}
	}
	
	else {while(z>x||z<y)
		{System.out.println("������� �������� �� ���������: �� "+y+" �� "+x);
		z=sc.nextInt();}
	while(z!=x) {
		z=z+1;
		count++;}
		}
	
	return count;
}
public int SchNIZ() {System.out.println("������� �������� ������ � ����� �������");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("������� �������� �� ����� �������");int z=sc.nextInt();
int count=0;
if(y>x) {while(z>y||z<x)
	{System.out.println("������� �������� �� ���������: �� "+x+" �� "+y);
	z=sc.nextInt();}
while(z!=x) {
	z=z-1;
	count++;}
}

else {while(z>x||z<y)
	{System.out.println("������� �������� �� ���������: �� "+y+" �� "+x);
	z=sc.nextInt();}
while(z!=y) {
	z=z-1;
	count++;}
	}

return count;}
}
