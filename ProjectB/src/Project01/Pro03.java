package Project01;

public class Pro03 {
	private String name; // 이름
	private int age; 	// 나이

	// 생성자 메소드 - 이름만 초기화한다
	public Pro03(String NewName)
	{
		this(NewName, 0);
	}

	// 생성자 메소드 - 나이만 초기화한다
	public Pro03(int NewAge)
	{
		this(null, NewAge);
	}

	// 생성자 메소드 - 이름과 나이를 초기화한다
	public Pro03(String NewName, int NewAge)
	{
		setName(NewName);
		setAge(NewAge);
	}

	// 사람의 이름을 반환한다
	public String getName()
	{
		return name;
	}

	// 사람의 나이를 반환한다
	public int getAge()
	{
		return age;
	}

	// 현 Pro03 객체의 정보에 대한 문자열을 반환한다
	public String toString ()
	{
		return (name + "\t\t" + age);
	}

	// 사람의 이름을 주어진 값으로 변경한다
	public void setName(String NewName)
	{
		name = NewName;
	}

	// 사람의 나이를 주어진 값으로 변경한다
	public void setAge(int NewAge)
	{
		age = NewAge;
	}
}