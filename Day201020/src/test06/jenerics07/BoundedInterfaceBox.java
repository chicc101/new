package test06.jenerics07;
interface Eatable { //인터페이스
	public String eat();
}

class Apple implements Eatable { //인터페이스를 구현한 Apple
	public String toString() {
		return "I am an apple."	;
	}

	public String eat()	{
		return "It tastes so good! ";
	}
}
class Box<T extends Eatable> { 
	//예외
	//상속 받는 다는 뜻이 아니라 
	//Eatable를 구현한 클래스만 T에 올수있다는 뜻
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
