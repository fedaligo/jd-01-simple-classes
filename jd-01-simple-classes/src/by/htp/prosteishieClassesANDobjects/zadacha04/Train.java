package by.htp.prosteishieClassesANDobjects.zadacha04;

public class Train {
String city;
int number;
int[] time=new int[2];

public Train(int number,String city,int[] time) {
	this.city=city;
	this.number=number;
	this.time=time;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int[] getTime() {
	return time;
}

public void setTime(int[] time) {
	this.time = time;
}

}
