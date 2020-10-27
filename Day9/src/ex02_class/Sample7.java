package ex02_class;
class Date {
	int year;
	int month;
	int day;

	void print1() {
		System.out.println(year + "." + month + "." + day);
	}
}

public class Sample7 {
	public static void main(String[] args) {
		Date d;
		d = new Date();
		d.year = 2012;
		d.month = 9;
		d.day = 5;
		d.print1();
	}
} 