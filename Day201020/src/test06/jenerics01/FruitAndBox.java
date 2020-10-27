package test06.jenerics01;

class Apple {
	public String toString() {
		return "apple";
	}
}

class Orange {
	public String toString() {
		return "orange";
	}
}

class AppleBox {
	private Apple ap ;
	public Apple getAp() {
		return ap;
	}
	public void setAp(Apple ap) {
		this.ap =ap;
	}

}

class OrangeBox {
	private Orange o ;
	public Orange getO() {
		return o;
	}
	public void setO(Orange o) {
		this.o = o;
	}

}
public class FruitAndBox {
	public static void main(String[] args) {
		//���ϴ�� �ڽ� ����
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		//������ �ڽ��� ��´�
		aBox.setAp(new Apple());
		oBox.setO(new Orange());
		//�ڽ����� ������ ������.
		Apple ap = aBox.getAp();
		Orange og = oBox.getO();
		System.out.println(ap);
		System.out.println(og);
	}

}
