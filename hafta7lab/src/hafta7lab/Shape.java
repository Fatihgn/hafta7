package hafta7lab;

public class Shape {
	protected int deger;
	protected String isim;
	public int alan() {
		return 0;
	}
	public int getDeger() {
		return deger;
	}
	public void setDeger(int deger) {
		this.deger = deger;
	}
	public Shape(int deger,String isim) {
		super();
		this.deger = deger;
		this.isim=isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

}
