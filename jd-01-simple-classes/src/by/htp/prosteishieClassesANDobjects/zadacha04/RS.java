package by.htp.prosteishieClassesANDobjects.zadacha04;

public class RS {
Train[] trains;
int count=0;
public RS() {trains=new Train[5];}
public void addTrain(Train newTrain) {
	trains[count]=newTrain;
	count++;
}
public Train[] getTrains() {
	return trains;
}
public void setTrains(Train[] trains) {
	this.trains = trains;
}
}
