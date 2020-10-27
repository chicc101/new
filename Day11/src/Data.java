
public class Data {
	int year;
	int month;
	int day;
	
	void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	void print2() {
		String s = "";
		switch(month) {
		case1 : s = "Jan"; break;
		case2 : s = "Feb"; break;
		case3 : s = "Mar"; break;
		case4 : s = "Apil"; break;
		case5 : s = "May"; break;
		case6 : s = "Jun"; break;
		case7 : s = "July"; break;
		case8 : s = "Aug"; break;
		case9 : s = "Sep"; break;
		case10 : s = "Oct"; break;
		case11: s = "Nob"; break;
		case12 : s = "Dec"; break;
		default : s = "ERROR"; break;
		}
		
		System.out.println(s + " " + day + "," +year);
		
	}
}

public class DataTest{
	public static void main(String[]args) {
		Data d;
		d = new Data();
		d.year = 2012;
		d.month = 9;
		d.day = 5;
		d.print1();
		
		
	}
}
