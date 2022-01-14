package hw3Q2JavaVariables;

import java.util.jar.Attributes.Name;

import hw2Q2JavaBasics.MyCar;

public class AboutMe {
	
	
	public String schoolName;// Here variable is declared
	public String name = "Razzak"; // Here variable is initialized
	public byte age = 36;
	public short MyYearlyRentHouse = 12345;
	public int myYearlySalary =100032;
	public long myBankBalance = 12369874536l;
	public float myHeight = 5.9002f;
	public double myGrade= 5.900267;
	public char sex = 'M';
	public boolean usCitizen = false;
	
	
	

	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();
		
		System.out.println("Me Name: " +aboutMe.name+", Me Age:"+aboutMe.age);
		

	}

}
