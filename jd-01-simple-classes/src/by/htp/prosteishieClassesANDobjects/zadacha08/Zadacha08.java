package by.htp.prosteishieClassesANDobjects.zadacha08;


public class Zadacha08 {

	public static void main(String[] args) {
		Customer c1=new Customer(28,"������ ���� ��������","������� 36",387,123456789);
		Customer c2=new Customer(77,"������ ���� ��������","������� 27",123,348576897);
		Customer c3=new Customer(34,"������� ����� ������������","����������� 6",345,237984997);
		Customer c4=new Customer(12,"�������� �������� ����������","��������� 90",546,203942040);
		Customer c5=new Customer(90,"��������� �������� ����������","�������� 4",875,456723057);
		Customer[]cs=new Customer[5];
		cs[0]=c1;
		cs[1]=c2;
		cs[2]=c3;
		cs[3]=c4;
		cs[4]=c5;
		CustomerLogic csL=new CustomerLogic();
		for(int i=0;i<cs.length;i++) {
			csL.numberKInfo(cs[i]);
		}
		/*
		 * String[] cs1=new String[]
		 * {c1.getFio(),c2.getFio(),c3.getFio(),c4.getFio(),c5.getFio()};
		 * Arrays.sort(cs1); for(String s:cs1) {System.out.println(s);}
		 */
		Magaz mag=new Magaz();
		for(int i=0;i<cs.length;i++) {mag.add(cs[i]);}
		MagazLogic mg=new MagazLogic();
		System.out.println();
		System.out.println("���������� ����������� �� ��������:");
		mg.customersFIO(mag);
		
		
	}

}
