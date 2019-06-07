package by.htp.prosteishieClassesANDobjects.zadacha09;

public class Library {
int count=0;
Book[] bk=new Book[10];

public void addBook(Book newBook) {
	bk[count]=newBook;
	count++;
}

public Book[] getBk() {
	return bk;
}

public void setBk(Book[] bk) {
	this.bk = bk;
}
}
