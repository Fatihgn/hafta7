package hafta7lab;

public class Square extends TwoDimensionalShape{
	//a=a^2
	public Square(int deger,String isim) {
		super(deger,isim);
	}
	public int alan() {
		int a;
		a=deger*deger;
		return a;
	}

	
}
