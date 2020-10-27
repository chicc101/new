package test06.jenerics04;

import java.util.ArrayList;
//제네릭상속
class DBox<L,R> extends Object {
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}

	public String toString() {
		return left + "&" + right;
	}
}

class MultiTypeParam {
	public static void main (String[] args) {
		//한줄로 쓰나 나누나 상관없음
		//DBox<String, Integer>=new DBox<String, Integer>();
		//DBox<String, Integer>=new DBox<>(); 뒤에껀 지워도 상관없음
		DBox<String, Integer> box;
		box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); //tostring
		
		//ArrayList
		ArrayList<DBox>arr = new ArrayList<DBox>();
		arr.add(box);
		System.out.println(arr.get(0));
	}
}
