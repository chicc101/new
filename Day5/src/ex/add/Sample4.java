package ex.add;

class Point {
	int x, y;
	public Point() {
		System.out.println("Point Ŭ���� ����");
		
	}
}
public class Sample4 {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p);
		
	}

}