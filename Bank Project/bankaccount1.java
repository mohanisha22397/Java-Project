package BankApplication;
import java.util.*;
public class BankAccount1 {
    private int accountBalance;    //stores the current balance
    private String customerName;   //stores the customer name
    private String accountNumber;  //stores the customer account number

    //constructor of bank account
    Account(String customerName, String accountNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
    }

    //function for depositing the given amount in the account
    public void depositCash(int amount){
        if(amount!=0){
            accountBalance=accountBalance+amount;         //update balance
        }
    }

    //function for withdrawing the given amount from the account
    public void withdrawCash(int amount){
        if(amount!=0){
            accountBalance=accountBalance-amount;         //update balance
        }
    }

    //function showing the menu interface
    public void display(){
        char option='\0';
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to Centurion Bank of India");
			System.out.println("Account holder's name: " + customerName);
			System.out.println("Account Number : " + accountNumber);
			System.out.println("\n");
			System.out.println(" A. Check Balance\n B. Deposit Cash\n C. Withdraw Cash\n D. Exit");

			do{
			    System.out.println("Enter an option");
			    option=sc.next().charAt(0);
			    System.out.println("\n");

			    switch(option){
			        case 'A':
			            System.out.println("Current Balance : " + accountBalance);
			            System.out.println("\n");
			            break;

			        case 'B':
			            System.out.println("Enter an amount want to deposit");
			            int deposit_Amount=sc.nextInt();
			            depositCash(deposit_Amount);
			            System.out.println("\n");
			            break;

			        case 'C':
			            System.out.println("Enter an amount want to deposit");
			            int withdrawl_Amount=sc.nextInt();
			            withdrawCash(withdrawl_Amount);
			            System.out.println("\n");
			            break;

			            case 'D':
			            System.out.println();
			            break;

			        default:
			            System.out.println("Invalid Operation!!!!!!. Please enter valid operation");
			            break;
			    }
			}while(option != 'E');
		}
        System.out.println("Thanks for using our banking services");
    }

    public static void main(String[] args)
    {
        Account person=new Account("John William" , "1092557890");
        person.display();
    }}

