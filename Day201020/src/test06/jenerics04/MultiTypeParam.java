package test06.jenerics04;

import java.util.ArrayList;
//���׸����
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
		//���ٷ� ���� ������ �������
		//DBox<String, Integer>=new DBox<String, Integer>();
		//DBox<String, Integer>=new DBox<>(); �ڿ��� ������ �������
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
