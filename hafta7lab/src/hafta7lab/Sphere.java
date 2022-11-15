package hafta7lab;

public class Sphere extends ThreeDimensionalShape{
//a=4π.r2
	protected int pi;

public Sphere(int deger,String isim, int pi) {
	super(deger,isim);
	this.pi = pi;
}
public int alan() {
	int a;
	a=pi*4*deger*deger;
	return a;
}
public int hacim() {
	int a;
	a=4/3*pi*deger*deger*deger;
	return a;
}
}
