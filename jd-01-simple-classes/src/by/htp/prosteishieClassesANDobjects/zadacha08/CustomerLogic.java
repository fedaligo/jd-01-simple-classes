package by.htp.prosteishieClassesANDobjects.zadacha08;

import java.util.Scanner;

public class CustomerLogic {
	Scanner sc=new Scanner(System.in);
	int x;
	int y;
	public CustomerLogic() {
		System.out.println("������� �������� ��������� ������ ������ �����:"+"\n ��=");
		this.x=sc.nextInt();
		System.out.println("��=");this.y=sc.nextInt();
	}
	public void numberKInfo(Customer cs) {
		if(x>y) {if(cs.getNumberK()>=y&&cs.getNumberK()<=x) 
		{System.out.println("id="+cs.getId()+" fio="+cs.getFio()+" adres="+cs.getAdres()+" number="+cs.getNumberK()+" serial="+cs.getSerialK());}}
		else {if(cs.getNumberK()>=x&&cs.getNumberK()<=y) 
		{System.out.println("id="+cs.getId()+" fio="+cs.getFio()+" adres="+cs.getAdres()+" number="+cs.getNumberK()+" serial="+cs.getSerialK());}}
		
	}
}
