package Project05;

// Student.java
// 학생을 나타낸다
public class Student
{
   private String name; // 이름
   private int number; 	// 번호

   // *****생성자 메소드*****

   // 이름만 초기화하면서 새로운 Student 객체를 생성한다
 

   // 이름과 번호를 초기화하면서 새로운 Student 객체를 생성한다
   public Student (int number, String name)
   {
      setNumber(number);
      setName(name);
   }

   // *****변경자 메소드*****

   // 이름을 주어진 값으로 변경한다
   public void setName(String name)
   {
      this.name = name;
   }

   // 번호를 주어진 값으로 변경한다
   public void setNumber(int number)
   {
      this.number = number;
   }
   

   // *****접근자 메소드*****

   // 이름을 반환한다
   public String getName()
   {
      return name;
   }

   // 번호를 반환한다
   public int getNumber()
   {
      return number;
   }

   // 현 Student 객체의 정보에 대한 문자열을 반환한다
   public String toString ()
   {
      return (name + "\t\t" + number);
   }

}