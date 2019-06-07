package by.htp.prosteishieClassesANDobjects.zadacha09;

public class Book {
int id;
String name;
String avtor;
String izdat;
int year;
int razmer;
int price;
String pereplet;
public Book(int id,String name,String avtor,String izdat,int year,int razmer,int price,String pereplet) {
	this.id= id;
	this.name= name;
	this.avtor= avtor;
	this.izdat=izdat;
	this.year= year;
	this.razmer= razmer;
	this.price=price;
	this.pereplet= pereplet;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAvtor() {
	return avtor;
}
public void setAvtor(String avtor) {
	this.avtor = avtor;
}
public String getIzdat() {
	return izdat;
}
public void setIzdat(String izdat) {
	this.izdat = izdat;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getRazmer() {
	return razmer;
}
public void setRazmer(int razmer) {
	this.razmer = razmer;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPereplet() {
	return pereplet;
}
public void setPereplet(String pereplet) {
	this.pereplet = pereplet;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", avtor=" + avtor + ", izdat=" + izdat + ", year=" + year
			+ ", razmer=" + razmer + ", price=" + price + ", pereplet=" + pereplet + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((avtor == null) ? 0 : avtor.hashCode());
	result = prime * result + id;
	result = prime * result + ((izdat == null) ? 0 : izdat.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((pereplet == null) ? 0 : pereplet.hashCode());
	result = prime * result + price;
	result = prime * result + razmer;
	result = prime * result + year;
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
	Book other = (Book) obj;
	if (avtor == null) {
		if (other.avtor != null)
			return false;
	} else if (!avtor.equals(other.avtor))
		return false;
	if (id != other.id)
		return false;
	if (izdat == null) {
		if (other.izdat != null)
			return false;
	} else if (!izdat.equals(other.izdat))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pereplet == null) {
		if (other.pereplet != null)
			return false;
	} else if (!pereplet.equals(other.pereplet))
		return false;
	if (price != other.price)
		return false;
	if (razmer != other.razmer)
		return false;
	if (year != other.year)
		return false;
	return true;
}

}
