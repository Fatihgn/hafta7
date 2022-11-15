package hafta7gerceklab;

public class HourlyEmployee extends Employee{
	protected int hour;
	protected int wage;
	public HourlyEmployee(String isim, String soyad, String tc, int hour, int wage) {
		super(isim, soyad, tc);
		this.hour = hour;
		this.wage = wage;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public void write() {
		super.write();
		System.out.println(" "+hour*wage);	
	}
	

}
