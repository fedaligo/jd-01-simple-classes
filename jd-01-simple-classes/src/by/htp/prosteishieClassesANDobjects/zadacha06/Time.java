package by.htp.prosteishieClassesANDobjects.zadacha06;

import java.util.Scanner;

public class Time {
	int min;
	int ch;
	int sec;
Scanner sc=new Scanner(System.in);
public void Inst() {
	System.out.print("Введите текущее время ");
	this.ch=sc.nextInt();
	if(ch>23||ch<0) {this.ch=0;}
	System.out.print(ch+" часов ");
	this.min=sc.nextInt();
	if(min>59||min<0) {this.min=0;}
	System.out.print(min+" минут ");
	this.sec=sc.nextInt();
	if(sec>59||sec<0) {this.sec=0;}
	System.out.print(sec+" секунд");
	System.out.println();
	
}

public void izSEC() {
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");
	System.out.println("На сколько секунд изменить время");
	int z=sc.nextInt();
	ch=ch+(z/3600);
	if(ch>23) {ch=ch%24;}
	min=min+((z%3600)/60);
	if(min>59) {min=min%60;}
	sec=sec+(z%3600)%60;
	if(sec>59) {sec=sec%60;}
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");
	}
public void izMIN() {
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");
	System.out.println("На сколько минут изменить время");
	int y=sc.nextInt();
	ch=ch+(y/60);
	if(ch>23) {ch=ch%24;}
	min=min+(y%60);
	if(min>59) {min=min%60;}
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");}
public void izCH() {
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");
	System.out.println("На сколько часов изменить время");
	int x=sc.nextInt();
	ch=(ch+x)%24;
	System.out.println("Текущее время "+ch+" часов "+min+" минут "+sec+" секунд");}
}
