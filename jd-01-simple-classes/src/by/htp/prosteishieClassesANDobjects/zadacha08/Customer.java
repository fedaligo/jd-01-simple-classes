package by.htp.prosteishieClassesANDobjects.zadacha08;

public class Customer {
int id;
String fio;
String adres;
int numberK;
int serialK;

public Customer(int id,String fio,String adres,int numberK,int serialK) {
	this.id=id;
	this.fio=fio;
	this.adres=adres;
	this.numberK=numberK;
	this.serialK=serialK;}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adres == null) ? 0 : adres.hashCode());
	result = prime * result + ((fio == null) ? 0 : fio.hashCode());
	result = prime * result + id;
	result = prime * result + numberK;
	result = prime * result + serialK;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (adres == null) {
		if (other.adres != null)
			return false;
	} else if (!adres.equals(other.adres))
		return false;
	if (fio == null) {
		if (other.fio != null)
			return false;
	} else if (!fio.equals(other.fio))
		return false;
	if (id != other.id)
		return false;
	if (numberK != other.numberK)
		return false;
	if (serialK != other.serialK)
		return false;
	return true;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", fio=" + fio + ", adres=" + adres + ", numberK=" + numberK + ", serialK=" + serialK
			+ "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFio() {
	return fio;
}
public void setFio(String fio) {
	this.fio = fio;
}
public String getAdres() {
	return adres;
}
public void setAdres(String adres) {
	this.adres = adres;
}
public int getNumberK() {
	return numberK;
}
public void setNumberK(int numberK) {
	this.numberK = numberK;
}
public int getSerialK() {
	return serialK;
}
public void setSerialK(int serialK) {
	this.serialK = serialK;
}

public Object compareTo(String fio2) {
	// TODO Auto-generated method stub
	return null;
}
}
