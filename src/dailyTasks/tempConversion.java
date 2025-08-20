package dailyTasks;

import java.util.Scanner;

public class tempConversion {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the temp in clesius :");
		double clecius = obj.nextDouble();
		double fahren = (clecius * 9/5)+32;
		double kelvin = clecius + 273.15;
		System.out.println("celsius to Fahrenhit :"+fahren);
		System.out.println("celsius to kelvin :"+ kelvin);
		System.out.println("enter the temp in Fahrenhit : ");
		double fahr = obj.nextDouble();
		double cle = (fahr -32)* 5/9;
		double kel = (fahr -32) * 5/9 + 273.15;
		System.out.println(" Fahrenhit to celsisus :"+cle);
		System.out.println("Fahrenhit to kelvin :"+ kel);
		System.out.println("enter the temp in kelvin : ");
		double kelvin1 = obj.nextDouble();
		double cle1 = kelvin-273.15;
		double frh = (kelvin - 273.15)* 9/5 +32;
		System.out.println(" kelvin to celsisus :"+cle1);
		System.out.println("kelvin to Fahrenhit :"+ frh);
		obj.close();

	}

}
