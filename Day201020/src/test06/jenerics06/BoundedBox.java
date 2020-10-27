package test06.jenerics06;


class Box<T> {
	private T ob;

	public T get() {
		return ob;
	}

	public void set(T ob) {
		this.ob = ob;
	}
}

class BoundedBox {
	public static void main (String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");
		
		Box<Box<String>> wBox = new Box<> ();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<> ();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
		
		
	}
}
