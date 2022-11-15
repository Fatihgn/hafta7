package hafta7gerceklab;

public class Employee {
	protected String isim,soyad;
	protected String tc;
	public Employee(String isim, String soyad, String tc) {
		super();
		this.isim = isim;
		this.soyad = soyad;
		this.tc = tc;
	}
	public void write() {
		System.out.println(isim+" "+soyad+" "+tc);
	}
	

}
