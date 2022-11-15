package hafta7lab;

public class Tetrahedron extends ThreeDimensionalShape{

	public Tetrahedron(int deger,String isim) {
		super(deger,isim);
	}
	public int alan() {
		int a;
		a=deger*2*2;
		return a;
	}
// a^2kök3
}
