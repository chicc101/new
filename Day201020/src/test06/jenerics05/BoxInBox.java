package test06.jenerics05;


class Box<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxInBox {
	public static void main (String[] args) {
		Box<Integer> iBox = new Box<Integer>() ;
		iBox.set(24);
		System.out.println(iBox.get());
	}
}
