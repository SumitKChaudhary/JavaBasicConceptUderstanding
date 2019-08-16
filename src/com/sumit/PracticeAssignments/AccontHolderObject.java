package com.sumit.PracticeAssignments;

public class AccontHolderObject 
{
	public static void main(String[] args) {
		
		AccountHolder sumit = new AccountHolder();
		AccountHolder amit = new AccountHolder();
		
		sumit.firstName ="Sumit";
		sumit.lastName =" Kumar";
		sumit.age = 29;
		sumit.acountBalance = 30000;
		sumit.testEligibilityForCreditCard();
		
		amit.firstName ="Amit";
		amit.lastName =" Kumar Chaudhary";
		amit.age = 20;
		amit.acountBalance = 10000;
		amit.testEligibilityForCreditCard();
		
		System.out.println(
				"First Name : "+sumit.firstName+"\n"+
				"Last Name: "+ sumit.lastName+ "\n"+
				"Age: "+sumit.age+"\n "+
				"Account Balance :"+ sumit.acountBalance+"\n "+
				"Status for elibility for credit card :"+
				sumit.eligibleForCreditCard);
		
		System.out.println("\n");
		System.out.println(
				"First Name : "+amit.firstName+"\n"+
				"Last Name: "+ amit.lastName+ "\n"+
				"Age: "+amit.age+"\n "+
				"Account Balance :"+ amit.acountBalance+"\n "+
				"Status for elibility for credit card :"+
				amit.eligibleForCreditCard);
	}

}
