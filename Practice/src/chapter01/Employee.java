package chapter01;
//실습 7.1: Employee.java
//직원을 나타낸다.

public class Employee
{
 public String name;	// 이름
 public int num;// 직원의 번호와 나이
 public	int age;// 여기에 코드를 삽입하세요

 // -------------------------------------------------------
 //  새로운 Employee 객체를 생성한다.
 // -------------------------------------------------------
	public Employee( )
	{

	}

	// 접근자 메소드 - 이름을 반환한다
	public String getName( )
	{
		return name;
	}

	// 접근자 메소드 - 번호을 반환한다
	public int getNumber( )
	{
		return num;// 여기에 코드를 삽입하세요
	}

	// 접근자 메소드 - 나이를 반환한다
	public int getAge( )
	{
		return age;// 여기에 코드를 삽입하세요
	}

 //  현 Employee 객체의 정보에 대한 문자열을 반환한다.
 public String toString ()
 {
		return name + "," + num + "," + age;// 여기에 코드를 삽입하세요
 }

	// 변경자 메소드 - 이름을 주어진 값으로 변경한다
	public void setName(String Name)
	{
		name = Name;
	}

	// 변경자 메소드 - 번호을 주어진 값으로 변경한다
	public void setNumber(int Number)
	{
		num = Number;// 여기에 코드를 삽입하세요
	}

	// 변경자 메소드 - 나이를 주어진 값으로 변경한다
	public void setAge(int Age)
	{
		age = Age;// 여기에 코드를 삽입하세요
	}
}