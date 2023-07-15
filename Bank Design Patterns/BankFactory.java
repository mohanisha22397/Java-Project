package DesignPatterns;

public class BankFactory {

public static Bank getBank(String type, String bankname, int roi) {
	// TODO Auto-generated method stub
	if("hdfc".equalsIgnoreCase(type))
		return new HDFC (bankname,roi);
else if ("sbi".equalsIgnoreCase(type))
		return new SBI (bankname,roi);
else if  ("axis".equalsIgnoreCase(type))
		return new AXIS (bankname,roi);
	return null;
}
}
