package test06.jenerics07;
interface Eatable { //�������̽�
	public String eat();
}

class Apple implements Eatable { //�������̽��� ������ Apple
	public String toString() {
		return "I am an apple."	;
	}

	public String eat()	{
		return "It tastes so good! ";
	}
}
class Box<T extends Eatable> { 
	//����
	//��� �޴� �ٴ� ���� �ƴ϶� 
	//Eatable�� ������ Ŭ������ T�� �ü��ִٴ� ��
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}

}

class BoundedInterfaceBox {
	public static void main (String[] args) {
		Box<Apple> box = new Box<>() ;
		box.set(new Apple());

		Apple ap = box.get();
		System.out.println(ap);

	}
}
