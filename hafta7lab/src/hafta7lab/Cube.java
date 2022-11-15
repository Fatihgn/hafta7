package hafta7lab;

public class Cube extends ThreeDimensionalShape{

	public Cube(int deger,String isim) {
		super(deger,isim);
	}
	public int alan() {
		int a;
		a=6*deger*deger;
		return a;
	}
//a=6k^2
	
}
