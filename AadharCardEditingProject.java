package getset;

import java.util.Scanner;

public class AadharDetail {
	
static Scanner ad = new Scanner(System.in);
    
    private String name;
    private long contact;
    private int age;
    private String address;
    private long aadhar_no;
    
    private AadharDetail() {
    	
    }
    
    public AadharDetail(String name,long contact,int age,String address,long aadhar_no) {
    	
    	this.name=name;
    	this.contact=contact;
    	this.address=address;
    	this.age=age;
    	this.aadhar_no=aadhar_no;
    }
    
    public int genOtp() {
    	return (int)(Math.random()*9999+9999);
    }
    public boolean verify() {
    	System.out.println("\t\t\t Enter the contact");
    	long user_entered_contact=ad.nextLong();  	
    if(contact==user_entered_contact)
    {
    	int sys_otp=genOtp();
    	System.out.println("Enter the Otp");
    	System.out.println(sys_otp);
    	int user_entered_otp=ad.nextInt();
    if(user_entered_otp==sys_otp) {
    	return true;
    }
    }
	return false;
     }
    
    public String getName(){
    	return name;
    }
    public void setName(String n_name) {
    	boolean is_valid=verify();
    	if(is_valid) {
    		name = n_name;
    		System.out.println("\t\t modification sucess");
    	}
    	else {
    		System.out.println("\t\tverication failed");
    	}
    }
    public long getContact() {
    	return contact;
    }
    public void setContact(long n_contact) {
    	boolean is_valid = verify();
    	if(is_valid) {
    		contact = n_contact;
    		System.out.println("\t\t Modification Success");
    	}
    	else {
    		System.out.println("\t\t Verification failed");
    	}
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int n_age) {
    	boolean is_valid = verify();
    	if(is_valid) {
    		age=n_age;
    		System.out.println("\t\tModification success");
    	}
    	else {
    		System.out.println("\t\tVerification failed");
    	}
    }
    public String getAddress() {
    	return address;
    }
    public void setAddress(String address) {
    	boolean is_valid = verify();
    	if(is_valid) {
    		this.address=address;
    		System.out.println("\t\tModification success");    		
    	}
    	else {
    		System.out.println("\t\tVerification failed");
    	}
    }
    	public long getAadhar_no() {
    		return aadhar_no;
    	}
    }




package getset;

import java.util.Scanner;

public class AadharUserInterface {
   private static final int case1 = 0;
   static Scanner ad = new Scanner(System.in); 
   static AadharDetail sridhar = new  AadharDetail("sridhar",6381275724L,23,"vadapalani",912347893892L);
   static boolean repeat_my_app=true;
   public static void main(String[]args) {
	   do {
		   System.out.println("select the input");
		   System.out.println("1.Get the Data \n 2.Set the Data \n 3.Exit");
		   int input = ad.nextInt();
		   if(input==1) {
			   display();
			   int user_wish = ad.nextInt();
			   switch(user_wish){
				 case1:{
					   System.out.println("Aadhar name :"+sridhar.getName());
					   break;
				   }
				   case2:{
					   System.out.println("User Contact :"+sridhar.getContact());
					   break;
				   }
				   case3:{
					   System.out.println("User Age :"+sridhar.getAge());
					   break;
				   }
				   case4:{
					   System.out.println("User Address :"+sridhar.getAddress());
					   break;
				   }
				   case5:{	
					   System.out.println("User aadhar_no :"+sridhar.getAadhar_no());
					   break;
				   }
			   }
		   }
			   else if(input == 2) {
				   display();
				   int user_wish=ad.nextInt();
				   switch(user_wish) {
				    
					  case1:{
						   sridhar.setName("sri");
						   break;}
					  case2:{
						   sridhar.setContact(8228606905L);
						   break;} 
					  case3:{
						  break;
					  }
					  case4:{
						  break;
					  }
					  case5:{
						  break;
					  }
				   }
			   }
				else if(input == 3){
					repeat_my_app = false;
				}
	   }
	                while(repeat_my_app);
					System.out.println("Thank You_______!");
				}
	   }
			public static void display() {
				System.out.println("select the input");
				System.out.println("1.Aadhar_no\n2.contact\n3.age\n4.Address\n5.aadhar _no");				
			
	   }
}

  	
    
    
    
    
    
    
    
    
    
    
    
    

