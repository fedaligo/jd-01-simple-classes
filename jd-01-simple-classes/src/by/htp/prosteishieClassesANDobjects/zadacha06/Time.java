package by.htp.prosteishieClassesANDobjects.zadacha06;

import java.util.Scanner;

public class Time {
	int min;
	int ch;
	int sec;
Scanner sc=new Scanner(System.in);
public void Inst() {
	System.out.print("������� ������� ����� ");
	this.ch=sc.nextInt();
	if(ch>23||ch<0) {this.ch=0;}
	System.out.print(ch+" ����� ");
	this.min=sc.nextInt();
	if(min>59||min<0) {this.min=0;}
	System.out.print(min+" ����� ");
	this.sec=sc.nextInt();
	if(sec>59||sec<0) {this.sec=0;}
	System.out.print(sec+" ������");
	System.out.println();
	
}

public void izSEC() {
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");
	System.out.println("�� ������� ������ �������� �����");
	int z=sc.nextInt();
	ch=ch+(z/3600);
	if(ch>23) {ch=ch%24;}
	min=min+((z%3600)/60);
	if(min>59) {min=min%60;}
	sec=sec+(z%3600)%60;
	if(sec>59) {sec=sec%60;}
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");
	}
public void izMIN() {
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");
	System.out.println("�� ������� ����� �������� �����");
	int y=sc.nextInt();
	ch=ch+(y/60);
	if(ch>23) {ch=ch%24;}
	min=min+(y%60);
	if(min>59) {min=min%60;}
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");}
public void izCH() {
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");
	System.out.println("�� ������� ����� �������� �����");
	int x=sc.nextInt();
	ch=(ch+x)%24;
	System.out.println("������� ����� "+ch+" ����� "+min+" ����� "+sec+" ������");}
}
