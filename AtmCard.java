package ATM;

import java.util.Scanner;

public class AtmCard
{
	static Scanner sc=new Scanner(System.in);
	static int db_atm_pin=1234;
	static long db_contact=6381275724L;
	static long db_contact2;

	public static void main(String[] args) throws Exception
	{

	System.out.println("\t\t\tSelect the Input ");

	System.out.println("1.Change Pin\n2.Add Contact\n3.Details Of Account Holder");
	
	int button=sc.nextInt();
	{
	if (button==1)
	{
	System.out.println("\t\tEnter the Contact");
	long user_enter_contact=sc.nextLong();
	if(user_enter_contact==db_contact)
	{
	System.out.println("\t\tEnter the OTP");
	Thread.sleep( 2008);
	int sys_otp=(int) (Math. random()*9999+9999);
	System.out.println(sys_otp);
	int user_enter_otp=sc.nextInt();
	if(user_enter_otp==sys_otp)
	{
	System.out.println("\t\tPlease Enter the New Pin");
	db_atm_pin=sc.nextInt();
	System.out.println("\t\tPin Modified Succesfully :"+db_atm_pin);
	}
	else
	{
	System.out.println("\t\t\tVerification Failed");
	}
	}
	}
	else if(button==2)
	{
		System.out.println("Please enter the second number");
		db_contact2=sc.nextLong();
		System.out.println("Number updated sucessfully: "+AtmDetails.db_contact2);
	}

	else if (button==3)
	{
	System.out.println("Pin :"+db_atm_pin);
	System.out.println("Contact :"+db_contact);
	}

	else if(button>3 || button<1)
	{
		System.out.println("Please select from the given option");
		
}
}
}
}


	
	
	
	
