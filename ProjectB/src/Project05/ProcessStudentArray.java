package Project05;

// ProcessStudentArray.java
// Student 객체들의 배열 처리를 보여준다.

import java.util.Scanner;

class ProcessStudentArray
{
   public static void main(String [ ] args)
   {
      Student [ ] stdArray;
      String      name;
      int         number;
      int         i;

      Scanner scan = new Scanner (System.in) ;
      stdArray = new Student[4];

      for (i = 0 ; i < stdArray.length; i++)
      {
         System.out.print("학생의 이름을 입력하세요: ");
         name = scan.next( );
         System.out.print("학생의 학번을 입력하세요: ");
         number = scan.nextInt( );

         // Studnt 객체를 생성한다
         stdArray[i] = new Student (number, name);
      }

      // stdArray 배열의 내용을 출력한다
      System.out.println();
      System.out.println("학번 \t 이름");

      for (i = 0 ; i < stdArray.length ; i++)
      {
         System.out.println(stdArray[i].getNumber( ) + " \t" + stdArray[i].getName( ));
      }
   }
}