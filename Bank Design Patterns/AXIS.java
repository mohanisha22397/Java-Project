package DesignPatterns;

public class AXIS extends Bank{
	private String BankName;
	private int ROI;
	
	
	public AXIS(String bankname, int roi) {
		// TODO Auto-generated constructor stub
		this.BankName =bankname;
		this.ROI=roi;
	}


	public String getBankName() {
		// TODO Auto-generated method stub
		return this.BankName;
	}

	public int getROI() {
		// TODO Auto-generated method stub
		return this.ROI;
	}
	
	
}
