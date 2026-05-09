package shape;
public class Box{
public double l;
public double h;
public double w;

public Box(){
	this.h=-1;
	this.l=-1;
	this.w=-1;
}
//cube
public Box(double side){
	this.w=side;
	this.l=side;
	this.h=side;
}
public Box(double l, double w, double h ){
	this.l=l;
	this.w=w;
	this.h=h;
}
public void Boxinfo(){
	System.out.println("this is fromm Box class");
}
}