package ex01_method;

public class Tv {
	String color;  // ����
	boolean power; // ��������(on/off)
	int channel;   // ä��
	void power() { power = !power; } // ����on/off
	void channelUp() {channel++;}      // ä�� ���̱�
	void channelDown() {channel--;}    // ä�� ���߱�

	public static void main(String[] args) {
		
		Tv t; //������������
		t = new Tv();  //�������� Ŭ���� ���� //������ ȣ��
		t.channel = 7; //
		t.channelDown(); 
		System.out.println(t.channel);

	}

}