package by.htp.prosteishieClassesANDobjects;

public class Zadach01Test1 {
public int x;
public int y;
public void m1(int x,int y){
	System.out.println("x="+x);
	System.out.println("y="+y);
}
public int m2_1(int x) {
	x=x+1;
	return x;
}
public int m2_2(int y) {
	y=y+1;
	return y;
}
public int m3(int x,int y) {
	int a=x+y;
	return a;
}
public void m4(int x,int y) {
	if(x>y) {System.out.println("наибольшее число ="+x);}
	else {System.out.println("наибольшее число ="+y);}
}
}
