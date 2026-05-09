package shape;
public class Boxweight extends Box{
	double weight;

    public Boxweight(double weight, double l, double w, double h) {
        super(l, w, h);
        this.weight = weight;
    }
	public void information(){
		System.out.println("dimensions of Box are :");
		System.out.println("length:"+l);
		System.out.println("width:"+w);
		System.out.println("heigth:"+h);
		System.out.println("weight:"+weight);
	}
	
}