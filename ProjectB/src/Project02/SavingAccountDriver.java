package Project02;
// SavingAccount 객체를 만들어 이용한다
public class SavingAccountDriver
{
   public static void main(String[ ] args)
   {
	  // 모든 저축예금 계좌의 이자율을 0.01로 wjd한다
	  SavingAccount.setInterestRate(0.01);

	  // 첫 번째 예금계좌를 만든다
      SavingAccount acct1 = new SavingAccount(101);
      // 첫 번째 예금계좌에 10,000원을 입금한다
      acct1.deposit(10000);
      // 첫 번째 예금계좌에서 5,000원을 출금한다
      acct1.withdraw(5000);
      // 첫 번째 예금계좌의 내역을 출력한다
      System.out.println(acct1.toString( ));
      System.out.println();

	  // 두 번째 예금계좌를 만든다
      SavingAccount acct2 = new SavingAccount(102);
      // 두 번째 예금계좌에 80,000원을 입금한다
      acct2.deposit(80000);
      // 두 번째 예금계좌에서 150,000원을 출금한다
      acct2.withdraw(150000);
      // 두 번째 예금계좌에서 70,000원을 출금한다
      acct2.withdraw(70000);
      // 두 번째 예금계좌의 내역을 출력한다
      System.out.println(acct2.toString( ));

      // acct2가 가리키는 예금계좌의 잔고를 출력한다
      SavingAccount.showBalance(acct2);
      System.out.println();

      // 개설된 저축예금 계좌들의 수를 출력한다
      System.out.println("생성된 계좌들의 수: " + SavingAccount.getNumberOfAccounts( ));
   }
}