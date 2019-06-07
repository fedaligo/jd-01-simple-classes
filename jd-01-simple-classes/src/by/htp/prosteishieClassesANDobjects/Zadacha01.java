package by.htp.prosteishieClassesANDobjects;

public class Zadacha01 {

	public static void main(String[] args) {
		Zadach01Test1 t1=new Zadach01Test1();
		int x=1;
		int y=2;
		t1.m1(x,y);
		x=t1.m2_1(x);
		y=t1.m2_2(y);
		System.out.println("x="+x+" y="+y);
		System.out.println(t1.m3(x,y));
		t1.m4(x, y);
	}

}
