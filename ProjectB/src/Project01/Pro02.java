package Project01;

public class Pro02 {
	String name; // 이름
	int age; 	// 나이

	// 생성자 메소드
	// 이름만 초기화하면서 새로운 Pro02 객체를 생성한다
	public Pro02(String NewName)
	{
		name = NewName;
	}

	// 나이만 초기화하면서 새로운 Pro02 객체를 생성한다
	public Pro02(int NewAge)
	{
		age = NewAge ;
	}

	// 이름과 나이를 초기화하면서 새로운 Pro02 객체를 생성한다
	public Pro02 (String NewName, int NewAge)
	{
		name = NewName;
		age = NewAge ;
	}
}