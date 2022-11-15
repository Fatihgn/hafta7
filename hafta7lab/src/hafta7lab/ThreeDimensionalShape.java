package hafta7lab;

public abstract class ThreeDimensionalShape extends Shape {

	public ThreeDimensionalShape(int deger,String isim) {
		super(deger,isim);
	}
	public abstract int alan();
	public int hacim() {
		return 0;
	}
}
