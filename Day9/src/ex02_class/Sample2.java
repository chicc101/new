package ex02_class;
class Rectangle {
	int width, height;
	int area() { return width*height; }
}
public class Sample2 {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 10;
        myRect.height = 20;
        System.out.println("∏È¿˚¿∫ " + myRect.area());
    }
}
