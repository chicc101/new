package ex02_class;

class Movie {
	int year;
	String title;

	void print() {
		System.out.println(year + ": " + title);
	}
}

public class Sample8 {
	public static void main(String[] args) {
		Movie m;
		m = new Movie();
		m.year = 2012;
		m.title = "Total Recall";
		m.print();
	}
}