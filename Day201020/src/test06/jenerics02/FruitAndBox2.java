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
	private Object ob; //Object ���Ŭ������ �θ�Ŭ����
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
		
		//���ϴ�� �ڽ� ����
		Box aBox = new Box();
		Box oBox = new Box();
		//������ �ڽ��� ��´�
		aBox.set(new Apple());
		oBox.set(new Orange());
		//�ڽ����� ������ ������.
		ap= (Apple)aBox.get();
		og= (Orange)oBox.get();
		System.out.println(ap);
		System.out.println(og);
	}

}
