package by.htp.prosteishieClassesANDobjects.zadacha08;

public class Magaz {
	
	
	int count=0;
Customer []allCS=new Customer[5];
public void add(Customer newCustomer) {
	allCS[count]=newCustomer;
	count++; 
}
public Customer[] getAllCS() {
	return allCS;
}
public void setAllCS(Customer[] allCS) {
	this.allCS = allCS;
}

}
