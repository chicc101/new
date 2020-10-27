package Project02;
// 저축예금 계좌를 모델한다
public class SavingAccount
{
   // 객체 변수
   private int accountNumber; 	// 계좌번호
   private double balance; 		// 잔고

   // 클래스 변수
   public static double interestRate = 0;	// 이자율
   public static int numberOfAccounts = 0;  // 생성된 객체들의 수

   // 생성자 메소드
   // 계좌번호를 매개변수 값으로 초기화하면서 새로운 SavingAccount 객체를 생성한다
   public SavingAccount(int number)
   {
	   accountNumber = number;
	   balance = 0;
	   numberOfAccounts++;  // 클래스 변수의 값을 변경한다
   }

   // 접근자 메소드

   // 클래스 메소드: 이자율을 반환한다
   public static double getInterestRate( )
   {
	   return interestRate;
   }

   // 클래스 메소드: 저축예금 계좌들의 수를 반환한다
   public static int getNumberOfAccounts( )
   {
	   return numberOfAccounts;
   }

   // 클래스 메소드
   // 매개변수 account가 가리키는 SavingAccount 객체의 잔고를 출력한다
   public static void showBalance(SavingAccount account)
   {
	   System.out.println(account.getAccountNumber() + "의 잔고: " + account.getBalance( ));
   }

   // 객체 메소드: 계좌 번호를 반환한다
   public int getAccountNumber()
   {
	   return accountNumber;
   }

   // 객체 메소드: 잔고를 반환한다
   public double getBalance( )
   {
	   return balance;
   }

   // 객체 메소드: 객체 변수들의 값들을 문자열의 형태로 반환한다
   public String toString( )
   {
	   String resultString = "";
       resultString = resultString + "계좌번호 : " + getAccountNumber( ) + "\n";
       resultString = resultString + "잔고 : " + getBalance( );
       return resultString;
   }

   // 변경자 메소드

   // 클래스 메소드: 이자율을 주어진 값으로 변경한다
   public static void setInterestRate(double newRate)
   {
	   interestRate = newRate;
   }

   // 객체 메소드: 계좌에 이자를 더한다
   public void addInterest( )
   {
	   balance = balance * (1 + getInterestRate( ));
   }

   // 객체 메소드: 계좌 번호를 주어진 값으로 변경한다
   public void setAccountNumber(int number)
   {
      accountNumber = number;
   }

   // 객체 메소드: 잔고를 주어진 값으로 변경한다
   public void setBalance(int amount)
   {
      balance = amount;
   }

   // 객체 메소드: 잔고를 주어진 입금액만큼 증가시킨다
   public void deposit(int amount)
   {
      balance = balance + amount;
   }

   // 객체 메소드: 잔고를 주어진 출금액만큼 감소시킨다
   public void withdraw(int amount)
   {
	  if (amount > balance)
	    System.out.println("오류: 현 잔고가 충분하지 않다");
	  else
	    balance = balance - amount;
   }
}