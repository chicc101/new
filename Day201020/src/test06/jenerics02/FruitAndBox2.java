package test06.jenerics02;

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am a orange";
	}
}

class Box {
	private Object ob; //Object 모든클래스의 부모클래스
	public void set(Object o ) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}


public class FruitAndBox2 {
	public static void main(String[] args) {
		Apple ap;
		Orange og;
		
		//과일담는 박스 생성
		Box aBox = new Box();
		Box oBox = new Box();
		//과일을 박스에 담는다
		aBox.set(new Apple());
		oBox.set(new Orange());
		//박스에서 과일을 꺼낸다.
		ap= (Apple)aBox.get();
		og= (Orange)oBox.get();
		System.out.println(ap);
		System.out.println(og);
	}

}
