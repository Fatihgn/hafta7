package hafta7lab;

public class Circle extends TwoDimensionalShape {
	//a=pi*r^2
	protected int pi;
	
	public Circle(int deger, String isim,int pi) {
		super(deger,isim);
		this.pi = pi;
	}
	public int alan() {
		int a;
		a=pi*deger*deger;
		return a;
	}
	
	
	
}
