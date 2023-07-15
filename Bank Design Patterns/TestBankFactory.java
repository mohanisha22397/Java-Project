package DesignPatterns;

public class TestBankFactory {
public static void main(String args[])
{
	Bank hdfc= BankFactory. getBank("hdfc", "HDFC", 10);
	Bank sbi= BankFactory.getBank("sbi", "SBI", 8);
	Bank axis= BankFactory.getBank("axis", "AXIS", 7);
	
	System.out.println("HDFC BankFactory is configured:"+hdfc);
	System.out.println("SBI BankFactory is configured:"+sbi);
	System.out.println("AXIS BankFactory is configured:"+axis);
	}
}
