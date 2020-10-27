package Project03;

public class ClassRoll 
{


	public static final int NOT_FOUND = -1;
	public String coursename; //교과목명
	public int count;//출석부에 있는 학생들의 수
	public int size;//출석부의 크기
	Student[] sbook;//Student 객체들의 배열
	
	//크기가 10인 빈 출석부 객체를 생성한다.
	public ClassRoll()
	{
		size = 10;
		count = 0;
		sbook = new Student[size];

	}
	
	// 한 Student 객첼르 출석부에 추가한다.
	public void add(Student newStudent) 
	{
		if (count >= size) 
			System.out.println("출석부의 크기 부족으로 추가할 수 없습니다.");
		else {
			sbook[count] = newStudent;
			count++; 


		}
	}

}
